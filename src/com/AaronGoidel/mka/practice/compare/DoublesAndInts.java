package com.AaronGoidel.mka.practice.compare;

/**
 * Created by agoidel2019 on 11/10/16.
 */
public class DoublesAndInts
{
    public static void main(String[] args)
    {
        int a = 100;
        double b = 100.2;

        System.out.println("Larger value: " + getMax(a, b));
        System.out.println("Smaller value: " + getMin(a, b));
    }

    static double getMax(double x, double y)
    {
        if(x > y) return x;
        else return y;
    }

    static double getMin(double x, double y)
    {
        if(x < y) return x;
        else return y;
    }
}
