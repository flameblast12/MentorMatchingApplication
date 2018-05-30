package com.example.student.mentormatchingapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SelectScreen extends AppCompatActivity {
    private Button SelectMentor;
    private Button SelectMentee;
    private Button Logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_which);

        SelectMentor = findViewById(R.id.Mentor);
        SelectMentee = findViewById(R.id.Mentee);
        Logout = findViewById(R.id.LogoutButton);

        SelectMentor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectScreen.this, MentorClassListView.class);
                startActivity(intent);
            }
        });

        SelectMentee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectScreen.this, MenteeClassListView.class);
                startActivity(intent);
            }
        });

        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "로그아웃하셨습니다.", Toast.LENGTH_LONG).show();
                finish();//////////////////////로그인 화면으로 돌아가서 아이디 패스워드 지우기
            }
        });
    }
}
