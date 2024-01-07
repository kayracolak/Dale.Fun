package com.kayra.dalefun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dalefun.R;

public class Health extends AppCompatActivity {

    private Button resultbtnH, advicebtnH, backtoMainH;
    private TextView welcomeTextH, ExpTextH, resultbmiH, already;
    private EditText heightH, weightH;
    private CheckBox MalecheckBoxH, FemalecheckBoxH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
        Intent intent = getIntent();
        backtoMainH = findViewById(R.id.backtoMainH);
        resultbtnH = findViewById(R.id.resultbtnH);
        advicebtnH = findViewById(R.id.advicebtnH);
        welcomeTextH = findViewById(R.id.welcomeTextH);
        ExpTextH = findViewById(R.id.ExpTextH);
        already = findViewById(R.id.already);
        resultbmiH = findViewById(R.id.resultbmiH);
        heightH = findViewById(R.id.heightH);
        weightH = findViewById(R.id.weightH);
        MalecheckBoxH = findViewById(R.id.MalecheckBoxH);
        FemalecheckBoxH = findViewById(R.id.FemalecheckBoxH);

        resultbtnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateBMI();
            }
        });
    }

    public void MaleBoxH(View view) {
        MalecheckBoxH.setChecked(true);
        FemalecheckBoxH.setChecked(false);
    }

    public void FemaleBoxH(View view) {
        MalecheckBoxH.setChecked(false);
        FemalecheckBoxH.setChecked(true);
    }

    private void calculateBMI() {
        String heightStr = heightH.getText().toString();
        String weightStr = weightH.getText().toString();

        if (heightStr.isEmpty() || weightStr.isEmpty()) {
            resultbmiH.setText("Please enter both height and weight");
            return;
        }

        float height = Float.parseFloat(heightStr);
        float weight = Float.parseFloat(weightStr);

        boolean Male = MalecheckBoxH.isChecked();
        boolean Female = FemalecheckBoxH.isChecked();

        if (!Male && !Female) {
            resultbmiH.setText("Please select your gender");
            return;
        }
        if (height < 100.00 || weight < 20) {
            resultbmiH.setText("Please write a correctly");
            return;
        }

        float bmi;
        if (Male) {
            bmi = weight / ((height / 100) * (height / 100));
        } else {
            bmi = weight / ((height / 100) * (height / 100)) + 1;
        }

        String resultText = "BMI: " + String.format("%.2f", bmi);
        resultbmiH.setText(resultText);
    }
    public void btnAdviceH(View view)
    {
        Intent intent = new Intent(Health.this , AdviceHealth.class);
        startActivity(intent);
    }
    public void btnBack(View view)
    {
        Intent intent = new Intent(Health.this , MainActivity.class);
        startActivity(intent);
    }
}