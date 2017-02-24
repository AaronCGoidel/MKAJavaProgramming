package com.AaronGoidel.mka.fibonacci;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by agoidel2019 on 9/13/16.
 */

public class CachedFibonacci
{
    private static Map<BigDecimal, BigDecimal> previousValuesHolder;

    static
    {
        previousValuesHolder = new HashMap<>();
        previousValuesHolder.put(BigDecimal.ZERO, BigDecimal.ZERO);
        previousValuesHolder.put(BigDecimal.ONE, BigDecimal.ONE);
    }

    public static BigDecimal fib(long position)
    {
        if (0 == position)
        {
            if(0 == position)
            {
            }
            System.out.println(0);
            return BigDecimal.ZERO;
        }
        else if (1 == position)
        {
            System.out.println(1);

            return BigDecimal.ONE;
        }
        else
        {
            System.out.println(0);
            System.out.println(1);
            System.out.println(1);


            if (previousValuesHolder.containsKey(BigDecimal.valueOf(position)))
            {
                return previousValuesHolder.get(BigDecimal.valueOf(position));
            }
            else
            {
                BigDecimal olderValue = BigDecimal.ONE,
                        oldValue = BigDecimal.ONE,
                        newValue = BigDecimal.ONE;

                for (int i = 3; i <= position; i++)
                {
                    newValue = oldValue.add(olderValue);
                    olderValue = oldValue;
                    oldValue = newValue;
                    System.out.println(newValue);
                }
                previousValuesHolder.put(BigDecimal.valueOf(position), newValue);
                return newValue;
            }
        }
    }

    public static void main(String[] args)
    {
        fib(1500);
    }
}
