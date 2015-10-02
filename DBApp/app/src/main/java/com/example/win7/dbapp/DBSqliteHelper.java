package com.example.win7.dbapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBSqliteHelper extends SQLiteOpenHelper {

    private static final int DB_VERSION  = 1;
    private static final String DB_NAME = "app.db";

    public static final String TABLE_NAME = "persons";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";


    public DBSqliteHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String create_table_sql = "create table if not exists " + TABLE_NAME
                + "( " + COLUMN_ID + " integer primary key autoincrement, " +
                COLUMN_NAME + " text );";
        db.execSQL(create_table_sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        /**
         * used only when a new version is supplied
         */

        db.execSQL("drop table if exists " + TABLE_NAME);
        this.onCreate(db);
    }
}
