package com.example.labassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ass1_Q3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ass1_q3);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText uname = findViewById(R.id.username);
                EditText pass = findViewById(R.id.password);

                String username = uname.getText().toString();
                String password = pass.getText().toString();

                //Log.d("cred1", username.toString());
                //Log.d("cred2", password.toString());

                if ((username.equals("")) || (password.equals(""))) {
                    Toast.makeText(getApplicationContext(), "All fields are required!", Toast.LENGTH_SHORT).show();
                } else {
                    Log.d("cred1", username.toString());
                    Log.d("cred2", password.toString());
                    if ((username.equals("admin")) && (password.equals("admin"))) {
                        Toast.makeText(getApplicationContext(), "Login Successful!", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Invalid Username/Password!", Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });
    }
}