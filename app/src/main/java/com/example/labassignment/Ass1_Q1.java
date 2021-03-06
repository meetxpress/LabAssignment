package com.example.labassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ass1_Q1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ass1_q1);

        getSupportActionBar().setDisplayShowCustomEnabled(true);
        TextView ans = (TextView) findViewById(R.id.ans);

        findViewById(R.id.btnCalc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText n1 = findViewById(R.id.number1);
                int num1 = Integer.parseInt(n1.getText().toString());

                EditText n2 = findViewById(R.id.number2);
                int num2 = Integer.parseInt(n2.getText().toString());
                ans.setText(String.valueOf(num1 + num2));
            }
        });
    }
}