package com.kayra.dalefun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dalefun.R;

public class twentyHealth extends AppCompatActivity {

    private TextView twentyWelcomeText, set, explainSet, regularC, explainRegularC, sleep, explainSleep, physical, explainPhysical, strengthC, explainStrengthC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty_health);

        twentyWelcomeText = findViewById(R.id.twentyWelcomeText);
        set = findViewById(R.id.set);
        explainSet = findViewById(R.id.explainSet);
        regularC = findViewById(R.id.regularC);
        explainRegularC = findViewById(R.id.explainRegularC);
        sleep = findViewById(R.id.sleep);
        explainSleep = findViewById(R.id.explainSleep);
        physical = findViewById(R.id.physical);
        explainPhysical = findViewById(R.id.explainPhysical);
        strengthC = findViewById(R.id.strengthC);
        explainStrengthC = findViewById(R.id.explainStrengthC);
    }
    public void btnBack(View view)
    {
        Intent intent = new Intent(twentyHealth.this , AdviceHealth.class);
        startActivity(intent);
    }
}