package com.example.marvinalbazi.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // - Logic Variables
    int teamA;
    int teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAddThreeB = (Button) findViewById(R.id.btn_team_b_three);
        btnAddThreeB.setOnClickListener(this);
    }

    // - add 3 points to team B
    public void addThreeB(){
        teamB = teamB + 3;
        displayB(teamB);
    }
    // - add 2 points to team B
    public void addTwoB(View view){
        teamB = teamB + 2;
        displayB(teamB);

    }
    // - add 1 points to team B
    public void addOneB(View view){
        teamB = teamB + 1;
        displayB(teamB);
    }
    // - add 3 points to team A
    public void addThree (View view){
        teamA = teamA + 3;
        display(teamA);
    }
    // - add 2 points to team A
    public void addTwo(View view){
        teamA = teamA + 2;
        display(teamA);

    }
    // - add 1 points to team A
    public void addOne(View view){
        teamA = teamA + 1;
        display(teamA);
    }
    // - Display score for team A
    public void display(int number){
        TextView updateScore = (TextView) findViewById(R.id.tv_score_A);
        updateScore.setText("" + number);


    }
    // - Display score for team B
    public void displayB (int number){
        TextView updateScoreB = (TextView) findViewById(R.id.tv_score_B);
        updateScoreB.setText("" + number);

    }
    // - Reset the score
    public void resetScore (View view){
        teamA = 0;
        teamB = 0;
        display(teamA);
        displayB(teamB);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn_team_b_three :
                addThreeB();
                break;
        }
    }
}
