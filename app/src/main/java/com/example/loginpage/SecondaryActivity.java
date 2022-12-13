package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        tv = findViewById(R.id.tv);

        String Name = getIntent().getStringExtra("Name");
        String Pass = getIntent().getStringExtra("pass");

        tv.setText("Welcome "+Name);
    }
}