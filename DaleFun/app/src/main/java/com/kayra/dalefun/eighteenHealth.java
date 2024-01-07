package com.kayra.dalefun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dalefun.R;

public class eighteenHealth extends AppCompatActivity {

    private Button backtoAdviceE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighteen_health);
        backtoAdviceE = findViewById(R.id.backtoAdviceE);
    }
    public void btnBack(View view)
    {
        Intent intent = new Intent(eighteenHealth.this , AdviceHealth.class);
        startActivity(intent);
    }
}