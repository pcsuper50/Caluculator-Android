package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class Mycal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycal);

        EditText et=findViewById(R.id.e1);
        EditText et2=findViewById(R.id.e2);
        Button bt=findViewById(R.id.b1);
        Button bt1=findViewById(R.id.b2);
        Button bt2=findViewById(R.id.b3);
        Button bt3=findViewById(R.id.b4);
        TextView t=findViewById(R.id.t1);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int x = Integer.parseInt(et.getText().toString());

                int y = Integer.parseInt((et2.getText().toString()));

                int result= x+y;

                t.setText("My Result is :"+result);
                et.setText("");
                et2.setText("");


            }
        });



        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int x = Integer.parseInt(et.getText().toString());

                int y = Integer.parseInt((et2.getText().toString()));

                int result= x-y;

                t.setText("My Result is :"+result);


            }
        });



        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int x = Integer.parseInt(et.getText().toString());

                int y = Integer.parseInt((et2.getText().toString()));

                int result= x*y;

                t.setText("My Result is :"+result);


            }
        });


        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int x = Integer.parseInt(et.getText().toString());

                int y = Integer.parseInt((et2.getText().toString()));

                int result= x/y;

                t.setText("My Result is :"+result);


            }
        });



    }
}