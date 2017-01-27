package com.AaronGoidel.mka.random;

import java.lang.reflect.Array;

/**
 * Created by agoidel2019 on 9/19/16.
 */
public class BenchRandomTest
{

    public static long Random(double values[])
    {
        long startTime = System.currentTimeMillis();

        int range0, range1, range2, range3, range4, range5, range6, range7, range8, range9, range10;
        range0 = range1 = range2 = range3 = range4 = range5 = range6= range7 = range8 = range9 = range10 = 0;

        double x;
        int genNum;

        for(genNum = 0; genNum < Array.getLength(values); genNum++)
        {
            x = values[genNum];
            if(0.0 <= x && x <= 0.1)
            {
                range0++;
            }
            else if (0.1 <= x && x <= 0.2)
            {
                range1++;
            }
            else if (0.2 <= x && x <= 0.3)
            {
                range2++;
            }
            else if (0.3 <= x && x <= 0.4)
            {
                range3++;
            }
            else if (0.4 <= x && x <= 0.5)
            {
                range4++;
            }
            else if (0.5 <= x && x <= 0.6)
            {
                range5++;
            }
            else if (0.6 <= x && x <= 0.7)
            {
                range6++;
            }
            else if (0.7 <= x && x <= 0.8)
            {
                range7++;
            }
            else if (0.8 <= x && x <= 0.9)
            {
                range8++;
            }
            else if (0.9 <= x && x <= 1.0)
            {
                range9++;
            }
        }


        long endTime = System.currentTimeMillis();

        return (endTime - startTime);

        /*System.out.println(range0);
        System.out.println(range1);
        System.out.println(range2);
        System.out.println(range3);
        System.out.println(range4);
        System.out.println(range5);
        System.out.println(range6);
        System.out.println(range7);
        System.out.println(range8);
        System.out.println(range9);

        System.out.println("\nTime: " + (endTime - startTime));*/

    }
}
