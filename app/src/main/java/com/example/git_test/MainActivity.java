package com.example.git_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RelativeLayout Pontok;
    TextView textPontok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pontok=findViewById(R.id.Ne_legyel_hulye);
        textPontok=findViewById(R.id.textPontok);
        Pontok.setOnClickListener();
    }
}
