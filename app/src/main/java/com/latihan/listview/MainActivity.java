package com.latihan.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] hari={"Senin","Selasa","Rabu","Kamis","Jumat","sabtu","Minggu"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.activity_listview,hari);
        ListView listview =(ListView) findViewById(R.id.lv);
        listview.setAdapter(adapter);
    }
}