package com.AaronGoidel.mka.prime;

/**
 * Created by agoidel2019 on 1/6/17.
 */

import java.math.BigInteger;
import java.util.Scanner;

//Miller–Rabin Test
public class PrimeTest
{
    public static boolean primeTest(BigInteger n)
    {
        int valOfN = n.intValue(); //get n in int form

        //Test simple numbers
        if(valOfN == 2 || valOfN == 3 || valOfN == 5 || valOfN == 7
                || valOfN == 11 || valOfN == 13 || valOfN == 17) return true;

        //Set values for d and s
        BigInteger d = n.subtract(BigInteger.ONE);
        BigInteger s = BigInteger.ZERO;


        while(d.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO))
        {
            d = d.shiftRight(1);
            s = s.add(BigInteger.ONE);
        }

        //iterate for each test number
        for(int a : new int[]{2, 3, 5, 7, 11, 13, 17})
        {
            if(tryComposite(a, d, n, s))
            {
                return false;
            }
        }
        return true;
    }

    private static boolean tryComposite(int a, BigInteger d, BigInteger n, BigInteger s)
    {
        BigInteger bigA = BigInteger.valueOf(a);

        if(bigA.modPow(d, n).equals(BigInteger.ONE))
        {
            return false;
        }

        for(int i = 0; BigInteger.valueOf(i).compareTo(s) < 0; i++)
        {
            //pow(a, 2**i * d, n) == n-1
            if(bigA.modPow(BigInteger.valueOf(2).pow(i).multiply(d), n).equals(n.subtract(BigInteger.ONE)))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        BigInteger num = in.nextBigInteger();

        long startTime = System.currentTimeMillis();
        boolean answer = primeTest(num);
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);

        if (answer)
        {
            System.out.println(num + " is prime");
        }else{
            System.out.println(num + " is NOT prime");
        }

        System.out.println(duration + " milliseconds");
    }
}