package com.example.ex2_03_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.annotation.Target;

public class MainActivity extends AppCompatActivity {

    private Button btnObjectManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnObjectManager = findViewById(R.id.button);

        btnObjectManager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startActIntent = new Intent(MainActivity.this, MainActivity2.class);
                startActIntent.putExtra("myString","Soy el extra que viaja");
                startActIntent.putExtra("myInt",1233);

                startActivity(startActIntent);

            }
        });

    }
}