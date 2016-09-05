package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void threePointsA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointsA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    public void freeThrowA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void threePointsB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointsB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    public void freeThrowB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.score_timeA_text_view);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.score_timeB_text_view);
        scoreView.setText(String.valueOf(score));
    }


}
