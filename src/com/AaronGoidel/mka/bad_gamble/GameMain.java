package com.AaronGoidel.mka.bad_gamble;

/**
 * Created by agoidel2019 on 11/2/16.
 */

// main game logic
public class GameMain
{

    public static void main(String args[])
    {
        // create new player as instance of player class
        Player player1 = new Player();

        // create new pair of dice
        DicePair dice = new DicePair();

        // run while player has money
        while(player1.balance > 0)
        {
            // print result of roll first (this is ok as the constructor instantiates the dice will a random roll)
            System.out.println("Rolled a " + dice.die1 +" and a " + dice.die2);

            // logic to determine if the player has won by virtue of rolling a 7 or 11
            if(dice.die1 + dice.die2 == 7 || dice.die1 + dice.die2 == 11)
            {
                // if they win give them 3 dollars and print that they won
                player1.balance += 3;
                System.out.println("WINNER!\n");
            }

            else
            {
                // if they lose take 1 dollar and print they lost a round
                player1.balance -= 1;
                System.out.println("BAD LUCK... \n");
            }

            // roll dice for next round
            dice.Roll();

            // increase roll number
            player1.rolls += 1;

            // logic for finding maximum
            // checks if current balance is greater than the current max
            if (player1.balance > player1.max)
            {
                // if true

                // set max to balance after past roll
                player1.max = player1.balance;
                // set roll where max was achieved to current roll
                player1.maxRoll = player1.rolls;
            }



        }

        System.out.println("You lasted " + player1.rolls + " turns in the Bad Gamble"); // print how many rolls were made
        System.out.println("You had a maximum of $" + player1.max + " at roll #" + player1.maxRoll); // print max and max roll
    }
}
