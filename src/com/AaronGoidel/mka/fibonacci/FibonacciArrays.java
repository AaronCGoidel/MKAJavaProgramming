package com.AaronGoidel.mka.fibonacci;

import java.io.PrintWriter;

/**
 * Created by agoidel2019 on 4/19/17.
 */
public class FibonacciArrays
{
    public static void main(String[] args)
    {
        int lim = 20; // how many of each number to generate
        long fibs[][] = new long[2][lim]; // array that will store numbers
        int evenCount = 0;
        int oddCount = 0;
        int fibCount = 0;
        boolean go = true;



        while(go) // sort numbers
        {
            long current = tailRecur(fibCount); // get next number in series
            if(current % 2 == 0 & evenCount < lim) // check if even
            {
                fibs[0][evenCount] = current; // add to even sub-list
                evenCount++;
            }else if(oddCount < lim)
            {
                fibs[1][oddCount] = current;
                oddCount++;
            }else if(evenCount == oddCount) // check if both lists are same length (meaning they are both full)
            {
                go = false; // set flag to false
            }
            fibCount++;
        }
        printer(fibs, lim); // run print

    }

    // tail-recursive fibonacci calculator
    public static long tailRecur(final int n)
    {
        return inner(0, 1, n);
    }

    private static long inner(final long a, final long b, final int n)
    {
        return n < 1 ? a : n == 1 ? b : inner(b, a + b, n - 1);
    }

    public static void printer(long list[][], int length)
    {
        PrintWriter out = new PrintWriter(System.out, false);
        out.format("%23s%9s%10s\n", "Even", "||", "Odd"); // format header
        for(int num = 0; num < length; num++)
        {
            out.format("%-9s%14d%9s%10d\n", "#" + (num+1), list[0][num], "||", list[1][num]); // format output

        }
        out.flush();
    }
}
