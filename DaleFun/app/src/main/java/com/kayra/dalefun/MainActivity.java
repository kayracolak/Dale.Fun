package com.kayra.dalefun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dalefun.R;

public class MainActivity extends AppCompatActivity {

    private TextView welcomeText;
    private TextView welcome2Text;
    private TextView welcome3Text;
    private ImageView dale;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcomeText = findViewById(R.id.welcomeText);
        welcome2Text = findViewById(R.id.welcome2Text);
        welcome3Text = findViewById(R.id.welcome3Text);
        dale = findViewById(R.id.dale);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

    }
    public void btnG(View view)
    {
        Intent intent = new Intent(MainActivity.this , GuessTheNumber.class);
        startActivity(intent);
    }
    public void btnC(View view)
    {
        Intent intent = new Intent(MainActivity.this , CarSuggestion.class);
        startActivity(intent);
    }
    public void btnS(View view)
    {
        Intent intent = new Intent(MainActivity.this , Score.class);
        startActivity(intent);
    }
    public void btnZ(View view)
    {
        Intent intent = new Intent(MainActivity.this , Health.class);
        startActivity(intent);
    }
    public void btnT(View view)
    {
        Intent intent = new Intent(MainActivity.this , TimeKeeper.class);
        startActivity(intent);
    }

}