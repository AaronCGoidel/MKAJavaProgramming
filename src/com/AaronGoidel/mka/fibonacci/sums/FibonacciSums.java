package com.AaronGoidel.mka.fibonacci.sums;

/**
 * Created by agoidel2019 on 11/17/16.
 */
public class FibonacciSums
{
    public static void main(String[] args)
    {

        long term1 = 0;
        long term2 = 2;
        long current = 0;
        long sum = term1 + term2;
        while((current = ( 4 * term2 + term1)) <= 4000000)
        {
            sum += current;
            term1 = term2;
            term2 = current;
        }
        System.out.println(sum);
    }
}
