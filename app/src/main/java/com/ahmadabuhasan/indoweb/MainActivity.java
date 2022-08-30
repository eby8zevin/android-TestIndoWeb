package com.ahmadabuhasan.indoweb;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ahmadabuhasan.indoweb.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.question1.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, QuestionActivity1.class)));

        binding.question2.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, QuestionActivity2.class)));

        binding.question3.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, QuestionActivity3.class)));

        binding.question4.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, QuestionActivity4.class)));

    }
}