package com.AaronGoidel.mka.fibonacci;

import java.util.Arrays;

/**
 * Created by agoidel2019 on 4/19/17.
 */
public class FibonacciArrays
{
    public static void main(String[] args)
    {
        int lim = 10;
        long fibs[][] = new long[2][lim];
        int evenCount = 0;
        int oddCount = 0;
        int fibCount = 0;
        boolean go = true;


        while(go)
        {
            long current = tailRecur(fibCount);
            if(current % 2 == 0 & evenCount < lim)
            {
                fibs[0][evenCount] = current;
                evenCount++;
            }else if(oddCount < lim)
            {
                fibs[1][oddCount] = current;
                oddCount++;
            }else if(evenCount == oddCount)
            {
                go = false;
            }
            fibCount++;
        }
        System.out.println(Arrays.deepToString(fibs));

    }
    public static long tailRecur(final int n)
    {
        return inner(0, 1, n);
    }

    private static long inner(final long a, final long b, final int n)
    {
        return n < 1 ? a : n == 1 ? b : inner(b, a + b, n - 1);
    }
}
