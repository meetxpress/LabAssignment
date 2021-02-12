package com.example.labassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
    }

    public void gotoActivity_ass1(View v) {
        switch (v.getId()) {
            case R.id.btnque1:
                startActivity(new Intent(getApplicationContext(), Ass1_Q1.class));
                break;

            case R.id.btnque2:
                startActivity(new Intent(getApplicationContext(), Ass1_Q2.class));
                break;

            case R.id.btnque3:
                startActivity(new Intent(getApplicationContext(), Ass1_Q3.class));
                break;

            default:
        }
    }
}