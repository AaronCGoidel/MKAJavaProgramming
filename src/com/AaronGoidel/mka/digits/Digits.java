package com.AaronGoidel.mka.digits;

/**
 * Created by agoidel2019 on 11/14/16.
 */
public class Digits
{
    private int value;
    private int firstDigit;
    private int lastDigit;
    private int length;

    private Digits()
    {
        this.value = generate();
        this.firstDigit = findFirst(this.value);
        this.lastDigit = findLast();
        this.length = findLength();
    }

    //Getters
    public int getValue()
    {
        return this.value;
    }

    public int getFirstDigit()
    {
        return this.firstDigit;
    }

    public int getLastDigit()
    {
        return this.lastDigit;
    }

    public int getLength()
    {
        return this.length;
    }

    //Find values
    private int findFirst(int num)
    {
        while (num < -9 || 9 < num)  num/= 10;
        return Math.abs(num);
    }

    private int findLast()
    {
        return this.value % 10;
    }

    private int findLength()
    {
         return (int)(Math.log10(this.value) + 1);
    }

    private int generate()
    {
        return (int) (Math.random() * 99999) + 1;
    }

    public static void main(String[] args)
    {
        Digits number = new Digits();
        System.out.println("Value of number: " + number.getValue());
        System.out.println("First digit of number: " + number.getFirstDigit());
        System.out.println("Last digit of number: " + number.getLastDigit());
        System.out.println("Number of digits in number: " + number.getLength());
    }
}
