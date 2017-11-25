package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int TeamAPoints = 0;
    int TeamBPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(TeamAPoints);
        displayForTeamA(TeamBPoints);
    }

    //Methods for Team A
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void TeamA3(View v){
        TeamAPoints+=3;
        displayForTeamA(TeamAPoints);
    }

    public void TeamA2(View v){
        TeamAPoints+=2;
        displayForTeamA(TeamAPoints);
    }

    public void TeamA1(View v){
        TeamAPoints+=1;
        displayForTeamA(TeamAPoints);
    }

    //Methods for Team B
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void TeamB3(View v){
        TeamBPoints+=3;
        displayForTeamB(TeamBPoints);
    }

    public void TeamB2(View v){
        TeamBPoints+=2;
        displayForTeamB(TeamBPoints);
    }

    public void TeamB1(View v){
        TeamBPoints+=1;
        displayForTeamB(TeamBPoints);
    }

    //Reset Button
    public  void reset(View v){
        TeamAPoints = 0;
        TeamBPoints = 0;
        displayForTeamA(TeamAPoints);
        displayForTeamB(TeamBPoints);
    }
}
