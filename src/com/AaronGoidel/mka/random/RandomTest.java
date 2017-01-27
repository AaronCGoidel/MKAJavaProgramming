package com.AaronGoidel.mka.random;

import java.lang.reflect.Array;

/**
 * Created by Aaron Goidel on 9/19/16.
 */
public class RandomTest
{
    public static void main(String args[])
    {
        double[] values = new double[1000000];
        int nums;

        for (nums = 0; nums < 1000000; nums++)
        {
            values[nums] = Math.random();
        }

        RandomTester(values);
    }

    public static long RandomTester(double values[])
    {
        long startTime = System.currentTimeMillis();
        int[] results = new int[10];

        double x;
        int genNum;

        for(genNum = 0; genNum < Array.getLength(values); genNum++)
        {
            x = values[genNum];
            results[(int)(x * 10)]++;
        }
        long endTime = System.currentTimeMillis();

        for(int i = 0; i < 10; i++)
        {
            System.out.println(results[i]);
        }
        System.out.println("\nIt took " + (endTime - startTime) + "ms to categorize a list of " + Array.getLength(values) + " random numbers");
        return (endTime - startTime);
    }
}
