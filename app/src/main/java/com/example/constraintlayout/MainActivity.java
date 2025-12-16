package com.example.constraintlayout;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.constraintlayout.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    PktViewModel pktViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pktViewModel = new ViewModelProvider(this).get(PktViewModel.class);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pktViewModel.addPunkty(pktViewModel.getPunkty());
                binding.textView.setText(pktViewModel.getPunkty());
            }
        });
        binding.plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pktViewModel.addPunkty(pktViewModel.getPunkty());
                pktViewModel.addPunkty(pktViewModel.getPunkty());
                binding.textView.setText(pktViewModel.getPunkty());
            }
        });
        binding.plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pktViewModel.addPunkty(pktViewModel.getPunkty());
                pktViewModel.addPunkty(pktViewModel.getPunkty());
                pktViewModel.addPunkty(pktViewModel.getPunkty());
                binding.textView.setText(pktViewModel.getPunkty());
            }
        });
    }

}