package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA   =   0;
    int foulTeamB   =   0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls for Team A.
     */
    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls for Team B.
     */
    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**adds three points for team A
     *
     * @param view
     */
    public void plus3A(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }


    /**adds two points for team A
     *
     * @param view
     */
    public void plus2A(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }


    /**adds one point for team A
     *
     * @param view
     */
    public void freeA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }


    /**adds three points for team B
     *
     * @param view
     */
    public void plus3B(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }


    /**adds two points for team B
     *
     * @param view
     */
    public void plus2B(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**adds one point for team B
     *
     * @param view
     */
    public void freeB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }


    /**minus one point for team A
     *
     * @param view
     */
    public void subtractOneForTeamA(View view)
    {
        foulTeamA--;
        scoreTeamA--;
        displayForTeamA(scoreTeamA);
        displayFoulForTeamA(foulTeamA);
    }


    /**minus one point for Team B
     *
     * @param view
     */
    public void subtractOneForTeamB(View view)
    {
        foulTeamB--;
        scoreTeamB--;
        displayForTeamB(scoreTeamB);
        displayFoulForTeamB(foulTeamB);
    }

    /**resets the scores and foul points to zero for both the teams
     *
     * @param view
     */
    public void reset(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        foulTeamA=0;
        foulTeamB=0;
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
