package com.AaronGoidel.mka.fibonacci;

/**
 * Created by agoidel2019 on 9/13/16.
 */
public class Fibonacci
{

    public static void main(String[] args)
    {
        largestFibonacciInt(100);
    }

    public static int largestFibonacciInt(int n)
    {
        int temp;
        int last = 1;
        int fib = 1;
        System.out.println(0);
        System.out.println(1);
        System.out.println(1);

        while (fib + last < n)
        {
            temp = fib;
            fib += last;
            last = temp;
            System.out.println(fib);
        }
        return fib;
    }
}

