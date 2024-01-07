package com.kayra.dalefun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dalefun.R;

public class smallerHealth extends AppCompatActivity {

    private Button backtoAdviceS;
    TextView smallerWelcomeText, protein, explainProtein, consult, explainConsult, strength, explainStrength, nutritional, explainNutr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smaller_health);
        Intent intent = getIntent();
        backtoAdviceS = findViewById(R.id.backtoAdviceS);
        smallerWelcomeText = findViewById(R.id.smallerWelcomeText);
        protein = findViewById(R.id.protein);
        consult = findViewById(R.id.consult);
        explainConsult = findViewById(R.id.explainConsult);
        strength = findViewById(R.id.strength);
        explainProtein = findViewById(R.id.explainProtein);
        explainStrength = findViewById(R.id.explainStrength);
        nutritional = findViewById(R.id.nutritional);
        explainNutr = findViewById(R.id.explainStrength);

    }
    public void btnBack(View view)
    {
        Intent intent = new Intent(smallerHealth.this , AdviceHealth.class);
        startActivity(intent);
    }

}