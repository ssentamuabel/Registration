package com.example.registerexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.user_name);
        TextView email = (TextView)findViewById(R.id.editTextTextEmailAddress2);
        TextView phone = (TextView) findViewById(R.id.editTextPhone);
        TextView password = (TextView) findViewById(R.id.editTextTextPassword);
        TextView confirmPassword =(TextView) findViewById(R.id.editTextTextPassword2);

        Button submitBtn = (Button) findViewById(R.id.register_button);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast =  Toast.makeText(getApplicationContext(), "Thanks for registering", Toast.LENGTH_SHORT);
                toast.show();
                
                Data data = new Data();

                data.setUsername(String.valueOf(username.getText()));
                data.setEmailAddress(String.valueOf(email.getText()));
                data.setPhoneNumber(String.valueOf(phone.getText()));
                data.setPassword(String.valueOf(password.getText()));

                Intent userdata = new Intent(getApplicationContext(), LoginActivity.class);


                userdata.putExtra("formdata", data);

                startActivity(userdata);


            }
        });
    }
}