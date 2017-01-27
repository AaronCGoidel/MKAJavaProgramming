package com.AaronGoidel.mka.practice.money_calculator;

/**
 * Created by agoidel2019 on 10/10/16.
 */

public class MoneyMain
{
    public static void main(String args[]) throws java.text.ParseException
    {
        final int[] denominations = {10000, 5000, 2000, 1000, 500, 100, 25, 10, 5, 1};

        MoneyGen generator = new MoneyGen();
        ChangeCalculator calculator = new ChangeCalculator();

        double amount = generator.randomMoney(0, 10000);

        double[] breakdown = calculator.makeChange(denominations, (int) (amount * 100));

        System.out.println("Amount: $" + amount);

        for (int i = 0; i < denominations.length; i++)
        {
            if (breakdown[i] > 0)
            {
                System.out.println((int)breakdown[i] + " x " + (double)denominations[i]/100);
            }
        }
    }
}

