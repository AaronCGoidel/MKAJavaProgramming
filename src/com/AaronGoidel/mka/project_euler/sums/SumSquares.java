package com.AaronGoidel.mka.project_euler.sums;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by agoidel2019 on 11/17/16.
 */
public class SumSquares
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("How big do you want the series to be? ");
        long max = input.nextLong();

        BigInteger sum = BigInteger.ZERO;
        BigInteger sumSqr;
        BigInteger sumOfSqr = BigInteger.ZERO;

        for (long i = 1; i <= max; i++)
        {
            sum = sum.add(BigInteger.valueOf(i));
            sumOfSqr = sumOfSqr.add(BigInteger.valueOf(i * i));
        }

        sumSqr = sum.multiply(sum);
        System.out.println(sumSqr + " + " + sumOfSqr);
        System.out.println(sumSqr.subtract(sumOfSqr).toString());
    }
}
