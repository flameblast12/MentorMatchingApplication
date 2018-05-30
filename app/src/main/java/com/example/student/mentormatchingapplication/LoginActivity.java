package com.example.student.mentormatchingapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
        }
    });
        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(), "로그인에 실패했습니다.", Toast.LENGTH_LONG).show();//
                Intent intent = new Intent(LoginActivity.this, SelectScreen.class);
                startActivity(intent);
            }
        });
}
}
