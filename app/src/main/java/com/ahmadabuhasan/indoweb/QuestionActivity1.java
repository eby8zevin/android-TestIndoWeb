package com.ahmadabuhasan.indoweb;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.ahmadabuhasan.indoweb.databinding.ActivityQuestion1Binding;

import java.util.ArrayList;

public class QuestionActivity1 extends AppCompatActivity {

    private ActivityQuestion1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuestion1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0 && i % 8 == 0) {
                list.add("IndoWeb");
            } else if (i % 4 == 0) {
                list.add("Indo");
            } else if (i % 8 == 0) {
                list.add("Web");
            } else {
                list.add("" + i);
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        binding.resultList.setAdapter(adapter);
    }
}