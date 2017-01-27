package com.AaronGoidel.mka.project_euler.sums;

/**
 * Created by agoidel2019 on 12/12/16.
 */
public class MultiplesOf3or5
{
    private int sum;
    private int max;

    private MultiplesOf3or5()
    {
        this.max = 1000;
        doMath();
    }

    private void doMath()
    {
        for(int x = 0; x < max; x += 3)
        {
            sum += x;
        }

        for(int y = 0; y < max; y += 5)
        {
            if(y % 3 != 0) // Handle three parity
                sum += y;
        }
    }

    public int getSum()
    {
        return sum;
    }

    public int getMax()
    {
        return max;
    }

    public void reset()
    {
        sum = 0;
    }

    public void setMax(int max)
    {
        this.max = max;
    }

    public static void main(String[] args)
    {
        MultiplesOf3or5 answer = new MultiplesOf3or5();
        System.out.print(answer.sum);
    }
}
