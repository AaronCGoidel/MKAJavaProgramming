package com.AaronGoidel.mka.prime;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by agoidel2019 on 2/5/17.
 */

public class IsPrime
{
    private static long isPrime(long n)
    {
        if ((n > 2 && (n & 1) == 0))
        {
            return 2;
        }
        else if (n > 3 && (n % 3 == 0))
        {
            return 3;
        }

        int maxLookup = (int) Math.sqrt(n);
        for (int i = 3; (i + 2) <= maxLookup; i = i + 6)
        {
            if (n % (i + 2) == 0 || n % (i + 4) == 0)
            {
                return i + 2;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        File inputFile = new File("ListOfRandomIntegers.txt");
        Scanner inFile;
        inFile = new Scanner(inputFile);

        long startTime = System.currentTimeMillis();

        while (inFile.hasNextLong())
        {
            long next = inFile.nextLong();
            long answer = isPrime(next);

            if (answer == 0)
            {
                System.out.println(next + " is prime");
            } else
            {
                System.out.println(next + " is NOT prime and is a multiple of: " + answer);
            }
        }
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(duration + " milliseconds");


    }
}
