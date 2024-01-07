package com.kayra.dalefun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dalefun.R;

public class thirtyHealth extends AppCompatActivity {

    private TextView thirtyWelcomeText, consultT, explainConsultT, regularT, explainRegularT, sleepT, explainSleepT, balancedT, explainBalancedT, medical, explainMedical;

    private Button backtoAdviceO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_health);

        thirtyWelcomeText = findViewById(R.id.thirtyWelcomeText);
        consultT = findViewById(R.id.consultT);
        explainConsultT = findViewById(R.id.explainConsultT);
        explainRegularT = findViewById(R.id.explainRegularT);
        regularT = findViewById(R.id.regularT);
        sleepT = findViewById(R.id.sleepT);
        explainSleepT = findViewById(R.id.explainSleepT);
        balancedT = findViewById(R.id.balancedT);
        explainBalancedT = findViewById(R.id.explainBalancedT);
        medical = findViewById(R.id.medical);
        explainMedical = findViewById(R.id.explainMedical);
        backtoAdviceO = findViewById(R.id.backtoAdviceO);
    }
    public void btnBack(View view)
    {
        Intent intent = new Intent(thirtyHealth.this , AdviceHealth.class);
        startActivity(intent);
    }
}