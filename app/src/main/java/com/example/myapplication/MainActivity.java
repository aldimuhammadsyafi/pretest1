package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/*
    Aldi Muhammad Syafi
    10116065
    IF-2
    CHANGE LOG Kamis 4 april 2019 15:55 v.0.0.1
    1.membuat layout MainActivity

    CHANGE LOG Jumat 5 april 2019 17:30 v.0.0.2
    1.membuat layout login

    CHANGE LOG Sabtu 6 april 2019  13:30 v.0.0.3
    1. membuat layout biodata

    CHANGE LOG Sabtu 6 april 2019 15:25 v.0.0.4
    2. membuat layout home
 */
public class MainActivity extends AppCompatActivity {
 private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlogin();
            }
        });
    }
        public void openlogin(){
            Intent intent= new Intent(this, login.class);
            startActivity(intent);
        }
    }

