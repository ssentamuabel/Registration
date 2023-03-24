package com.example.registerexercise;

import static java.lang.Math.log;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.logging.Log;

import java.io.Serializable;
import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        ArrayList<String> userData = getIntent().getStringArrayListExtra("formdata");

        Data userData = (Data) getIntent().getSerializableExtra("formdata");


        EditText username = (EditText) findViewById(R.id.user_name_login);

        EditText password = (EditText) findViewById(R.id.password_login);



        Button btn = (Button) findViewById(R.id.login_button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                


                if(userData.getUsername().equals(String.valueOf(username.getText())) && userData.getPassword().equals(String.valueOf(password.getText()))){
                    Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                    Toast.makeText(getApplicationContext(), userData.getUsername()+ " thanks for registering.", Toast.LENGTH_SHORT).show();
                    intent.putExtra("finaldata", userData);
                    startActivity(intent);

                    getSupportActionBar().setTitle("login");
                }else{
                    Toast.makeText(getApplicationContext(), "Wrong password or username ", Toast.LENGTH_LONG).show();
                }




            }
        });


    }
}