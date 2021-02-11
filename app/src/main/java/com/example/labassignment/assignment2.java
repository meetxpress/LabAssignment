package com.example.labassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class assignment2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment2);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
    }
    public void gotoActivity_ass2(View v) {
        switch (v.getId()) {
            case R.id.que1:
                //startActivity(new Intent(getApplicationContext(), Ass1_Q1.class));
                Toast.makeText(getApplicationContext(), "Button 1", Toast.LENGTH_SHORT).show();
                break;

            case R.id.que2:
                //startActivity(new Intent(getApplicationContext(), Ass1_Q2.class));
                break;

            case R.id.que3:
                //startActivity(new Intent(getApplicationContext(), Ass1_Q3.class));
                break;

            default:
        }
    }
    public void raise(){
        Toast.makeText(getApplicationContext(), "Button 1", Toast.LENGTH_SHORT).show();
    }
}