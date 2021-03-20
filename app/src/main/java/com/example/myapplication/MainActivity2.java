package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView screen2tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        screen2tv1=findViewById(R.id.screen2_tv1);
        Intent intent=getIntent();
        String str=intent.getStringExtra("details");
        screen2tv1.setText(str);


    }
}