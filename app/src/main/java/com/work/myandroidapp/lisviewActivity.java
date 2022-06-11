package com.work.myandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

public class lisviewActivity extends AppCompatActivity {


    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lisview);
        lv = findViewById(R.id.listview1);

        adapter listviewadapeter = new adapter(lisviewActivity.this);

        lv.setAdapter(listviewadapeter);

    }

}