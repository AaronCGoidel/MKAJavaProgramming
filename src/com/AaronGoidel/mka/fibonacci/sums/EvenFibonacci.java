package com.AaronGoidel.mka.fibonacci.sums;

/**
 * Created by agoidel2019 on 11/28/16.
 */
class FibSum
{
    int accumulator;
    int currentFibNum;
    int lastFibNum;

    FibSum()
    {
        accumulator = 0;
        currentFibNum = 2;
        lastFibNum = 1;
    }

    private static boolean isEven(int x)
    {
        if (x % 2 == 0) return true;
        return false;
    }

    void checkAddNum(int y)
    {
        if (isEven(y)) accumulator += y;
    }

    int fibonacciMath()
    {
        checkAddNum(lastFibNum);

        int tempNum;

        while (currentFibNum < 4e6)
        {
            checkAddNum(currentFibNum);
            tempNum = currentFibNum;
            currentFibNum += lastFibNum;
            lastFibNum = tempNum;
        }

        return accumulator;
    }

}

public class EvenFibonacci
{

    public static void main(String[] args)
    {
        FibSum evenFibSum = new FibSum();


        System.out.println("The sum of the even Fibonacci numbers less than 4 million is " + evenFibSum.fibonacciMath());

    }

}
