package com.AaronGoidel.mka.practice.compare;

/**
 * Created by agoidel2019 on 11/10/16.
 */
public class SeperateSolutionMain
{
    public static void main(String[] args)
    {
        int a = 100;
        double b = 100.2;

        System.out.println("Larger value: " + SeperateSolution.getMax(a, b));
        System.out.println("Smaller value: " + SeperateSolution.getMin(a, b));
    }
}
