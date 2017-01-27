package com.AaronGoidel.mka.practice.money_calculator;

/**
 * Created by agoidel2019 on 10/10/16.
 */
public class ChangeCalculator
{
    public static double[] makeChange(int[] denominations, int amount)
    {

        double[] count = new double[denominations.length];

        for (int i = 0; i < denominations.length; i++)
        {
            while (amount >= denominations[i])
            {
                count[i]++;
                amount -= denominations[i];
            }
        }

        return count;
    }

}

