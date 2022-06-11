package com.work.myandroidapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class dialogbox extends AppCompatActivity {

    Button btn_toast,btn_alert, btn_pdialog;
    Spinner dropdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogbox);

        btn_toast = findViewById(R.id.btn_toast);
        btn_alert = findViewById(R.id.btn_alert);
        btn_pdialog = findViewById(R.id.pdialog);
        dropdown = findViewById(R.id.dropdown);


        btn_toast.setOnClickListener(view->{

     Toast.makeText(dialogbox.this,"hello ",Toast.LENGTH_LONG).show();

        });


        btn_alert.setOnClickListener(view->{
        AlertDialog.Builder alertbox = new AlertDialog.Builder(dialogbox.this);
            alertbox.setTitle("Information");
            alertbox.setMessage("This is alert dialog box");


            alertbox.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent x = new Intent(dialogbox.this,MainActivity.class);
                    startActivity(x);
                }
            });

            alertbox.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(dialogbox.this, "You clicked Noo", Toast.LENGTH_SHORT).show();
                }
            });
            alertbox.show();
        });


        btn_pdialog.setOnClickListener(view->{

            ProgressDialog pdialog = new ProgressDialog(dialogbox.this);
            pdialog.setTitle("Loading...");
            pdialog.setMessage("Do you want to continue?");
            pdialog.show();



        });


        List<String> items = new ArrayList<>();
        items.add("Select a car...");
        items.add("Tesla");
        items.add("Audi");
        items.add("BMW");
        items.add("Ferrari");

        SpinnerAdapter spinnerAdapter = new ArrayAdapter<>(dialogbox.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,items);

        dropdown.setAdapter(spinnerAdapter);



    }
}