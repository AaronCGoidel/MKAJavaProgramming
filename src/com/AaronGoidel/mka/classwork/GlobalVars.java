package com.AaronGoidel.mka.classwork;

/**
 * Created by agoidel2019 on 11/14/16.
 */
public class GlobalVars
{
    public static void falseSwap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args)
    {
        int x = 3;
        int y = 4;

        System.out.println(x + " " + y + "\n");
        falseSwap(x, y);
        System.out.println(x + " " + y + "\n");
    }





}




