package com.example.semester_project;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class HomeActivity extends AppCompatActivity {

    TextView welcomeText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        welcomeText = findViewById(R.id.welcomeText);


        // Get username from LoginActivity (optional)
        String username = getIntent().getStringExtra("username");
        if (username != null && !username.isEmpty()) {
            welcomeText.setText("Welcome, " + username + "!");
        } else {
            welcomeText.setText("Welcome to the Home Page!");
        }


    }
}
