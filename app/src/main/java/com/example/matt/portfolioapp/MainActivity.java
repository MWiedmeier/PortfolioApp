package com.example.matt.portfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        System.out.println("Testing git configuration");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
