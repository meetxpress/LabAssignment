package com.example.labassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class assignment1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment1);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        /*findViewById(R.id.que1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        findViewById(R.id.que2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Ass1_Q2.class));
            }
        });

        findViewById(R.id.que3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Ass1_Q3.class));
            }
        });*/
    }

    public void gotoActivity(View v) {
        switch (v.getId()) {
            case R.id.que1:
                startActivity(new Intent(getApplicationContext(), Ass1_Q1.class));
                break;

            case R.id.que2:
                startActivity(new Intent(getApplicationContext(), Ass1_Q2.class));
                break;

            case R.id.que3:
                startActivity(new Intent(getApplicationContext(), Ass1_Q3.class));
                break;

            default:
        }
    }
}