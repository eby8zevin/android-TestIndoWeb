package com.ahmadabuhasan.indoweb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ahmadabuhasan.indoweb.databinding.ActivityQuestion4Binding;

public class QuestionActivity4 extends AppCompatActivity {

    private ActivityQuestion4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuestion4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.toReference.setOnClickListener(view -> {
            String url = "https://github.com/eby8zevin/Android-PointOfSale/actions/workflows/android_build.yml";
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(i);
        });
    }
}