package com.example.win7.dbapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.sql.SQLException;
import java.util.ArrayList;

public class MainActivity extends Activity {

    ListView lv;
    PersonDataSource dataSource;
    ArrayList<Person> persons;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{
            dataSource = new PersonDataSource(this);
            dataSource.open();

            persons = dataSource.getPersons();
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, persons);

            lv = (ListView)findViewById(R.id.list_view);
            lv.setAdapter(adapter);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void add( View v){
        EditText et = (EditText)findViewById(R.id.name_field);
        String name = et.getText().toString();
        Person person = dataSource.addPerson(name);
        adapter.add(person);
        adapter.notifyDataSetChanged();

        et.setText("");
    }

}
