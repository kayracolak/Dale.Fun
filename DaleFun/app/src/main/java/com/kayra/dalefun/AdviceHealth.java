package com.kayra.dalefun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dalefun.R;

public class AdviceHealth extends AppCompatActivity {

    private TextView welcomeTextAdvice, chooseBmiAdvice;
    private CheckBox smaller, eighteen, twentynine, bigger;
    private ImageView picofbmiH;
    private Button outcomebtnAdvice, backtobmiH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice_health);
        Intent intent = getIntent();
        welcomeTextAdvice = findViewById(R.id.welcomeTextAdvice);
        chooseBmiAdvice = findViewById(R.id.chooseBmiAdvice);
        smaller = findViewById(R.id.smaller);
        eighteen = findViewById(R.id.eighteen);
        twentynine = findViewById(R.id.twentynine);
        bigger = findViewById(R.id.bigger);
        picofbmiH = findViewById(R.id.picofbmiH);
        backtobmiH = findViewById(R.id.backtobmiH);
        outcomebtnAdvice = findViewById(R.id.outcomebtnAdvice);
    }
    public void btnBackBmi(View view)
    {
        Intent intent = new Intent(AdviceHealth.this , Health.class);
        startActivity(intent);
    }
    public void smallerC(View view)
    {
        smaller.setChecked(true);
        eighteen.setChecked(false);
        twentynine.setChecked(false);
        bigger.setChecked(false);
    }
    public void eighteenC(View view)
    {
        smaller.setChecked(false);
        eighteen.setChecked(true);
        twentynine.setChecked(false);
        bigger.setChecked(false);
    }
    public void twentynineC(View view)
    {
        smaller.setChecked(false);
        eighteen.setChecked(false);
        twentynine.setChecked(true);
        bigger.setChecked(false);
    }
    public void biggerC(View view)
    {
        smaller.setChecked(false);
        eighteen.setChecked(false);
        twentynine.setChecked(false);
        bigger.setChecked(true);
    }
    public void btnAdvice(View view)
    {
        if(smaller.isChecked() == true)
        {
            Intent intent = new Intent(AdviceHealth.this , smallerHealth.class );
            startActivity(intent);
        }
        else if(eighteen.isChecked() == true)
        {
            Intent intent = new Intent(AdviceHealth.this , eighteenHealth.class );
            startActivity(intent);
        }
        else if(twentynine.isChecked() == true)
        {
            Intent intent = new Intent(AdviceHealth.this , twentyHealth.class );
            startActivity(intent);
        }
        else if(bigger.isChecked() == true)
        {
            Intent intent = new Intent(AdviceHealth.this , thirtyHealth.class );
            startActivity(intent);
        }
    }
}