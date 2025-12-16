package com.example.constraintlayout;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.constraintlayout.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score++;
                binding.textView.setText(score);
            }
        });
        binding.plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score++;
                binding.textView.setText(score);
            }
        });
        binding.plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score+=;
                binding.textView.setText(score);
            }
        });
    }

}