package com.kayra.dalefun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dalefun.R;

public class LearntoScore extends AppCompatActivity {

    private TextView welcomeScoreGame, mainofScore, mainofLuckTap;

    private Button backtoScoreScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnto_score);
        Intent intent = getIntent();
        welcomeScoreGame = findViewById(R.id.welcomeScoreGame);
        mainofScore = findViewById(R.id.mainofScore);
        mainofLuckTap = findViewById(R.id.mainofLuckTap);
        backtoScoreScreen = findViewById(R.id.backtoScoreScreen);
    }
    public void btnBack(View view)
    {
        Intent intent = new Intent(LearntoScore.this , Score.class);
        startActivity(intent);
    }
}