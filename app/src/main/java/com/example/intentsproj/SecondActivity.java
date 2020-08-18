package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText editTxt1;
    EditText editTxt2;

    TextView txtSum;

    String number_1;
    String number_2;

    int n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editTxt1 = (EditText) findViewById(R.id.editTextPhone1);
        editTxt2 = (EditText) findViewById(R.id.editTextPhone2);
        txtSum = (TextView) findViewById(R.id.txt_sum);

        Intent intent = getIntent();

        number_1 = intent.getStringExtra("number1");
        number_2 = intent.getStringExtra("number2");

        editTxt1.setText(number_1);
        editTxt2.setText(number_2);

        n1 = Integer.parseInt(number_1);
        n2 = Integer.parseInt(number_2);

    }

    public void add(View view){

        txtSum.setText(number_1 + " + " + number_2 + "   =   " + (n1+n2));

    }

    public void subtract(View view){

        txtSum.setText(number_1 + " + " + number_2 + "   =   " + (n1-n2));

    }

    public void multiply(View view){

        txtSum.setText(number_1 + " + " + number_2 + "   =   " + (n1*n2));

    }

    public void divide(View view){

        txtSum.setText(number_1 + " + " + number_2 + "   =   " + (n1/n2));

    }




}