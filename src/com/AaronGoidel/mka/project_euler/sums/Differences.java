package com.AaronGoidel.mka.project_euler.sums;

/**
 * Created by agoidel2019 on 11/17/16.
 */
public class Differences
{
    private static int squareOfSum(int limit)
    {
        int sum = (limit * (limit + 1)) / 2;
        return sum * sum;
    }

    private static int sumOfSquares(int limit)
    {
        int sum = 0;
        for (int i = 1; i <= limit; i++)
        {
            sum += i * i;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int difference = squareOfSum(100) - sumOfSquares(100);
        System.out.printf("The difference is %d\n", difference);
    }
}
