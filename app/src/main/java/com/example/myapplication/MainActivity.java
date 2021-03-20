package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    EditText ed1;
    EditText ed2;
    EditText ed3;
    EditText ed4;
    EditText ed5;
    androidx.appcompat.widget.AppCompatButton b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.screen1_tv1);
        ed1=findViewById(R.id.screen1_et1);
        ed2=findViewById(R.id.screen1_et2);
        ed3=findViewById(R.id.screen_et3);
        ed4=findViewById(R.id.screen1_et4);
        ed5=findViewById(R.id.screen_et5);
        b1=findViewById(R.id.screen1_b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=b1.getText().toString();
                Intent intent= new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("details",str);
                startActivity(intent);

            }
        });


    }
}