package com.ahmadabuhasan.indoweb;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ahmadabuhasan.indoweb.databinding.ActivityQuestion2Binding;

import java.util.Objects;

public class QuestionActivity2 extends AppCompatActivity {

    private ActivityQuestion2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuestion2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(view -> checkPalindrome(Objects.requireNonNull(binding.editTextInputWord.getText()).toString().trim()));
    }

    private void checkPalindrome(String value) {

        int i = 0;
        if (i < value.length() / 2) {
            if (value.charAt(i) != value.charAt(value.length() - 1)) {
                binding.textViewStatus.setText(R.string.not_palindrome);
            } else {
                binding.textViewStatus.setText(R.string.palindrome);
            }
        }
    }
}