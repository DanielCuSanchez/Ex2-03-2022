package com.example.ex2_03_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myTextView = findViewById(R.id.textView);

        Intent myAccessIntent = getIntent();

        String myTextFromActivity1 =  myAccessIntent.getStringExtra("myString");

        myTextView.setText(myTextFromActivity1);


    }
}