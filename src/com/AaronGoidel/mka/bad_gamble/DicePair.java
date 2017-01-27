package com.AaronGoidel.mka.bad_gamble;

/**
 * Created by agoidel2019 on 11/2/16.
 */

// Create class for pair of dice
public class DicePair
{
    // int value of what dice come up as
    public int die1;
    public int die2;

    // constructor: roll dice as they are created
    public DicePair()
    {
        Roll();
    }

    // set die roll to random int 1-6 inclusive
    public void Roll()
    {
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
    }
}
