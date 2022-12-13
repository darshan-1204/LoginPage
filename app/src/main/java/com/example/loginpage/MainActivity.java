package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText username,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        username = findViewById(R.id.username);
        pass = findViewById(R.id.pass);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = username.getText().toString();
                String password =pass.getText().toString();

                Intent intent = new Intent(MainActivity.this,SecondaryActivity.class);
                intent.putExtra("Name",name);
                intent.putExtra("pass",password);
                startActivity(intent);
            }
        });
    }
}