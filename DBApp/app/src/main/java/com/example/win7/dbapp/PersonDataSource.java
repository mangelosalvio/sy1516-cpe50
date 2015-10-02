package com.example.win7.dbapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonDataSource {
    private SQLiteDatabase database;
    private DBSqliteHelper helper;
    private String[] allColumns;

    public PersonDataSource(Context context){
        helper = new DBSqliteHelper(context);
        allColumns = new String[]{ DBSqliteHelper.COLUMN_ID,  DBSqliteHelper.COLUMN_NAME};
    }

    public void open() throws SQLException{
        database = helper.getWritableDatabase();
    }

    public void close() throws SQLException{
        database.close();
        helper.close();
    }

    public Person addPerson(String name){
        ContentValues values = new ContentValues();
        values.put(DBSqliteHelper.COLUMN_NAME, name);
        long _id = database.insert(DBSqliteHelper.TABLE_NAME, null, values);
        Cursor cursor = database.query(DBSqliteHelper.TABLE_NAME, allColumns,
                DBSqliteHelper.COLUMN_ID + " = " + _id, null, null, null, null);
        cursor.moveToFirst();
        Person person = cursorToPerson(cursor);
        cursor.close();

        return person;
    }

    public ArrayList<Person> getPersons(){
        ArrayList<Person> persons = new ArrayList<Person>();
        Cursor cursor = database.query(DBSqliteHelper.TABLE_NAME, allColumns, null, null, null, null, null);
        cursor.moveToFirst();
        while( !cursor.isAfterLast() ){
            persons.add(cursorToPerson(cursor));
            cursor.moveToNext();
        }
        cursor.close();

        return persons;
    }

    public Person cursorToPerson(Cursor cursor){
        /**
         * 0 is 1st column
         * 1 is second column
         *
         * order is on how you created your table
         */
        return new Person(cursor.getLong(0), cursor.getString(1));
    }
}
