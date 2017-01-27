package com.AaronGoidel.mka.random;

/**
 * Created by agoidel2019 on 9/19/16.
 */


public class RandomMain
{
    public static void main(String args[])
    {
        double[] values = new double[1000000];
        int nums, trials;
        for(trials = 0; trials < 20; trials++)
        {
            System.out.println();

            for(nums = 0; nums < 1000000; nums++)
            {
                values[nums] = Math.random();
            }

            System.out.println("Bench: " + BenchRandomTest.Random(values));
            System.out.println("Test: " + RandomTest.RandomTester(values));
        }
    }
}
