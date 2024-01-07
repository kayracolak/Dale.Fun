package com.kayra.dalefun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

import com.example.dalefun.R;

public class TimeKeeper extends AppCompatActivity {

    private Chronometer chronometer;
    private Button startButton, pauseButton, resetButton, backmenuT;
    private boolean isRunning = false;
    private long pauseOffset = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_keeper);

        chronometer = findViewById(R.id.kronometre);
        startButton = findViewById(R.id.btnStart);
        pauseButton = findViewById(R.id.btnPause);
        resetButton = findViewById(R.id.btnReset);
        backmenuT = findViewById(R.id.backmenuT);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isRunning) {
                    if (pauseOffset == 0) {
                        chronometer.setBase(SystemClock.elapsedRealtime());
                    } else {
                        chronometer.setBase(SystemClock.elapsedRealtime() - pauseOffset);
                    }
                    chronometer.start();
                    isRunning = true;
                    startButton.setVisibility(View.INVISIBLE);
                    pauseButton.setVisibility(View.VISIBLE);
                    resetButton.setVisibility(View.VISIBLE);
                }
            }
        });

        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isRunning) {
                    chronometer.stop();
                    pauseOffset = SystemClock.elapsedRealtime() - chronometer.getBase();
                    isRunning = false;
                    startButton.setVisibility(View.VISIBLE);
                    pauseButton.setVisibility(View.INVISIBLE);
                }
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.stop();
                chronometer.setBase(SystemClock.elapsedRealtime());
                pauseOffset = 0;
                isRunning = false;
                startButton.setVisibility(View.VISIBLE);
                pauseButton.setVisibility(View.INVISIBLE);
            }
        });
    }
    public void btnBack(View view)
    {
        Intent intent = new Intent(TimeKeeper.this , MainActivity.class);
        startActivity(intent);
    }
}