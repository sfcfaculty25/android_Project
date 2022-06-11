package com.work.myandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    //empty components
    EditText txtbox1;
    TextView textview1;
    Button btn_click , btn_nextpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtbox1 = findViewById(R.id.txtbox1);
        textview1 = findViewById(R.id.textview1);
        btn_click = findViewById(R.id.btn_click);

    btn_click.setOnClickListener(view->{
        textview1.setText(txtbox1.getText().toString());
        txtbox1.setText("");
    });


    btn_nextpage = findViewById(R.id.btn_next);

    btn_nextpage.setOnClickListener(view->{

        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);

    });





    }
}