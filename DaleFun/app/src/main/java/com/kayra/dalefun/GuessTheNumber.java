package com.kayra.dalefun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dalefun.R;

import java.util.Random;

public class GuessTheNumber extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    private EditText editTxtNumber;
    private Button btnGuess;
    private Button btnTryAgain;
    private Button backmenu;
    private TextView txtViewRemaining, txtViewResult;
    private ImageView imageView;
    private int remainingTries = 5;
    private int targetNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_the_number);
        sharedPreferences = getSharedPreferences("com.example.guessthenumber", Context.MODE_PRIVATE);
        editTxtNumber = findViewById(R.id.editTxtNumber);
        btnGuess = findViewById(R.id.btnGuess);
        btnTryAgain = findViewById(R.id.btnTryAgain);
        backmenu = findViewById(R.id.backmenu);
        txtViewRemaining = findViewById(R.id.txtViewRemaining);
        txtViewResult = findViewById(R.id.txtViewResult);
        imageView = findViewById(R.id.imageView);
        Intent intent = getIntent();

        targetNumber = sharedPreferences.getInt("storedNumber", new Random().nextInt(50) + 1);
        remainingTries = sharedPreferences.getInt("storedRemaining", 5);

        txtViewRemaining.setText("Remaining: " + remainingTries);

        btnGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String guessText = editTxtNumber.getText().toString();

                if (!guessText.isEmpty()) {
                    int userGuess = Integer.parseInt(guessText);

                    if (userGuess == targetNumber) {
                        txtViewResult.setText("                        Result is: Correct!");
                    } else if (userGuess > 50)  {
                        txtViewResult.setText("Maximum number is 50. Please try again");
                    } else if (userGuess < targetNumber) {
                        txtViewResult.setText("                                   Too low!");
                    } else if (userGuess > targetNumber) {
                        txtViewResult.setText("                                   Too high!");
                    }

                    remainingTries--;
                    txtViewRemaining.setText("Remaining: " + remainingTries);

                    if (remainingTries == 1) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(GuessTheNumber.this);
                        alert.setMessage("This is your last shot(make or break)");
                        alert.setPositiveButton("Break", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                targetNumber = new Random().nextInt(50) + 1;
                                remainingTries = 5;
                                txtViewRemaining.setText("Remaining: " + remainingTries);
                                txtViewResult.setText("");

                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putInt("storedRemaining", remainingTries);
                                editor.putInt("storedNumber", targetNumber);
                                editor.apply();
                            }
                        });

                        alert.setNegativeButton("Make", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.dismiss();
                            }
                        });

                        alert.show();
                    } else if (remainingTries == 0) {
                        txtViewResult.setText("   Correct number " + targetNumber);
                        remainingTries = 5;
                        targetNumber = new Random().nextInt(50) + 1;
                    }

                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putInt("storedRemaining", remainingTries);
                    editor.putInt("storedNumber", targetNumber);
                    editor.apply();
                }
            }
        });
        btnTryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                targetNumber = new Random().nextInt(50) + 1;
                remainingTries = 5;
                txtViewRemaining.setText("Remaining: " + remainingTries);
                txtViewResult.setText("");

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("storedRemaining", remainingTries);
                editor.putInt("storedNumber", targetNumber);
                editor.apply();
            }
        });
    }
    public void backtomenu(View view)
    {
        Intent intent = new Intent(GuessTheNumber.this , MainActivity.class);
        startActivity(intent);
    }
}