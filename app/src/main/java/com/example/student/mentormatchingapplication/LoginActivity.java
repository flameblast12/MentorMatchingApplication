package com.example.student.mentormatchingapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private Button LogIn;
    private Button SignUp;
    private EditText InputID;
    private EditText InputPW;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        LogIn = findViewById(R.id.LoginButton);
        SignUp = findViewById(R.id.SignupButton);
        InputID = findViewById(R.id.IDText);
        InputPW = findViewById(R.id.PasswordText);


    }
}
