package com.ahmadabuhasan.indoweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class QuestionActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        String input = "Indoweb Semakin Maju";
        String[] s = input.split(" ");

        StringBuffer buffer = new StringBuffer();
        for (int i = s.length; i > 0; i--) {
            buffer.append(s[i - 1]).append(" ");
        }
        System.out.println(buffer);
    }
}