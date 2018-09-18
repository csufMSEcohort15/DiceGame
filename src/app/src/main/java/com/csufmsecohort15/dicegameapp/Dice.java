package com.csufmsecohort15.dicegameapp;

import java.math.*;

public class Dice
{
    private int currFace; // currentFace of the Dice

    //Class Constructor
    public Dice()
    {
        this.currFace = 0;
    }


    /*The way this function works is by generating a random number between 1 and 6 by calling the
    * math.random function defined in the Java language and multiplying by the range of
    * possible numbers and adding the minimum. The math.random function returns a number x such
    * that 0 <= x < 1 and is a decimal number with multiple digits of precision and we then multiply
    * this decimal by the range of numbers we want to be in which is 1 thru 6 so you essentially are
    * calculating a random percentage of the total possible numbers. Then we int cast it to drop the
    * decimal because the face of the die is an int and then we add the minimum to handle the case
    * in which the random function generates a 0, we add the minimum die number 1 so that the die
    * face will have a value of at least 1*/
    public int Roll()
    {
        int range = 6, min = 1;
        this.currFace = (int)(Math.random() * range) + min;
        return this.currFace;
    }


    //Getter and Setter Methods
    public int getCurrFace() {
        return currFace;
    }

    public void setCurrFace(int currFace) {
        this.currFace = currFace;
    }

}
