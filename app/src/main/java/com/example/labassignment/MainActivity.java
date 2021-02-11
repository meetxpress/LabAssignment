package com.example.labassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoMainActivty(View v) {
        switch (v.getId()) {
            case R.id.lab1:
                startActivity(new Intent(getApplicationContext(), assignment1.class));
                break;

            case R.id.lab2:
                startActivity(new Intent(getApplicationContext(), assignment2.class));
                break;
        }
    }
}