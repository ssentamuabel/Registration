package com.example.registerexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView username = (TextView) findViewById(R.id.username_home);
        TextView email = (TextView) findViewById(R.id.email_home);

       // ArrayList<String> userData = getIntent().getStringArrayListExtra("finaldata");

        Data userData = (Data) getIntent().getSerializableExtra("finaldata");

        username.setText(userData.getUsername());
        email.setText( userData.getEmailAddress());



    }
}