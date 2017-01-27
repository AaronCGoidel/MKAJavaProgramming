package com.AaronGoidel.mka.prime;

import java.util.Scanner;

/**
 * Created by agoidel2019 on 1/4/17.
 */
public class IsPrime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to test: ");
        long num = in.nextLong();
        System.out.println();

        long startTime = System.currentTimeMillis();
        boolean answer = isPrimeNum(num);
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);

        if (answer)
        {
            System.out.println(num + " is prime");
        }else{
            System.out.println(num + " is NOT prime");
        }

        System.out.println(duration + " nano seconds");
    }

    public static boolean isPrimeNum(long n)
    {
        //test even
        if(n > 2 && (n & 1) == 0)
        {
            return false;
        }
        //test odd up to n^0.5
        for(int i = 3; i * i <= n; i += 2)
        {
            if (n % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}
