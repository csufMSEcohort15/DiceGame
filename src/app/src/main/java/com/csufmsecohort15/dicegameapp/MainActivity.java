package com.csufmsecohort15.dicegameapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private static Dice playerDice, computerDice1, computerDice2;
    private static int playerScore, computerScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startGame(View view)
    {
        playerDice = new Dice();
        playerScore = 0;
        computerScore = 0;
        computerDice1 = new Dice();
        computerDice2 = new Dice();
        computerScore = CalcModSum(computerDice1.Roll(), computerDice2.Roll());
        
    }

    private int CalcModSum(int dice1, int dice2)
    {
        int moddedSum = 0;
        moddedSum = (dice1 + dice2) % 6;
        return moddedSum;
    }

}
