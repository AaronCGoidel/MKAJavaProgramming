package com.AaronGoidel.mka.bad_gamble;

/**
 * Created by agoidel2019 on 11/2/16.
 */

// player class
public class Player
{
    public int balance; // how much money the player has
    public int rolls; // what number roll it is
    public int max; // maximum amount of money earned
    public int maxRoll; //what roll the max was achieved on

    // constructor sets initial balance to $100
    public Player()
    {
        balance = 100;
    }
}

