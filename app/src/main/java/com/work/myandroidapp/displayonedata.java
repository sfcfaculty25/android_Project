package com.work.myandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class displayonedata extends AppCompatActivity {


    ImageView fullimg;
    TextView title, description;
    Button btn_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayonedata);

        Intent intentdata = getIntent();

        fullimg = findViewById(R.id.fullimg);
        title = findViewById(R.id.titlee);
        description = findViewById(R.id.desc);
        btn_back = findViewById(R.id.btn_back);

        btn_back.setOnClickListener(view->{
            Intent intent = new Intent(displayonedata.this,lisviewActivity.class);
            startActivity(intent);
        });

        title.setText(intentdata.getStringExtra("title"));
        description.setText(intentdata.getStringExtra("description"));
        fullimg.setImageResource(intentdata.getIntExtra("img",0));


    }
}