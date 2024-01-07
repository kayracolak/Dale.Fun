package com.kayra.dalefun;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dalefun.R;

import java.util.Random;

public class Score extends AppCompatActivity {
    private int score = 0;
    private int luckynumber;
    private int userScorePlayer1 = 0;
    private int userScorePlayer2 = 0;
    private int maxTaps = 30;
    private int currentPlayer = 1; // Player 1 starts
    private Button btnTap;
    private Button btnRestart;
    private Button backmenua, learnBtn;
    private TextView tvScore;
    private TextView finishtext;
    private TextView userScoreViewPlayer1;
    private TextView userScoreViewPlayer2;
    private TextView joker;
    private TextView winner;
    private TextView learnmessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Intent intent = getIntent();

        btnTap = findViewById(R.id.btnTap);
        backmenua = findViewById(R.id.backmenua);
        btnRestart = findViewById(R.id.btnRestart);
        learnBtn = findViewById(R.id.learnBtn);
        tvScore = findViewById(R.id.tvScore);
        joker = findViewById(R.id.joker);
        finishtext = findViewById(R.id.finishtext);
        winner = findViewById(R.id.winner);
        learnmessage = findViewById(R.id.learnmessage);
        userScoreViewPlayer1 = findViewById(R.id.userScoreViewPlayer1);
        userScoreViewPlayer2 = findViewById(R.id.userScoreViewPlayer2);

        resetGame();

        btnTap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseScore();
            }
        });

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartGame();
            }
        });
    }
    public void BtnLearn(View view)
    {
        Intent intent = new Intent(Score.this , LearntoScore.class);
        startActivity(intent);
    }
    public void btnBackS(View view)
    {
        Intent intent = new Intent(Score.this , MainActivity.class);
        startActivity(intent);
    }
    private void increaseScore() {
        if (score < maxTaps) {
            score++;
            tvScore.setText("Score: " + score);
            updateUI();

            if (score == luckynumber) {
                resetScore();
            }
        } else {
            finishGame();
        }
    }

    private void resetScore() {
        if (currentPlayer == 1) {
            userScorePlayer1 += score;
        } else {
            userScorePlayer2 += score;
        }

        score = 0;
        tvScore.setText("Score: 0");

        if (userScorePlayer1 >= maxTaps || userScorePlayer2 >= maxTaps) {
            determineWinner();
            finishGame();
        } else {
            Random random = new Random();
            luckynumber = random.nextInt(20) + 1;
            JokerMessage();
        }

        switchPlayer();
        updateUI();
    }

    private void restartGame() {
        userScorePlayer1 = 0;
        userScorePlayer2 = 0;
        resetGame();
    }

    private void finishGame() {
        btnTap.setEnabled(false);
    }

    private void resetGame() {
        score = 0;
        tvScore.setText("Score: 0");
        winner.setText("Winner : ");

        Random random = new Random();
        luckynumber = random.nextInt(20) + 1;

        btnTap.setEnabled(true);
        WelcomeMessage();

        updateUI();
    }

    private void updateUI() {
        userScoreViewPlayer1.setText("Player 1's Score: " + userScorePlayer1);
        userScoreViewPlayer2.setText("Player 2's Score: " + userScorePlayer2);
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == 1) ? 2 : 1;
    }

    private void determineWinner() {
        String winnerText = "Winner: ";
        if (userScorePlayer1 > userScorePlayer2) {
            winnerText += "Player 1!";
        } else if (userScorePlayer2 > userScorePlayer1) {
            winnerText += "Player 2!";
        } else {
            winnerText += "It's a tie!";
        }
        winner.setText(winnerText);
    }

    private void WelcomeMessage() {
        finishtext.setText("    Welcome to the Two-Player Tapping Game!    ");
    }

    private void JokerMessage() {
        finishtext.setText(" The Joker appears! ");
    }
}
