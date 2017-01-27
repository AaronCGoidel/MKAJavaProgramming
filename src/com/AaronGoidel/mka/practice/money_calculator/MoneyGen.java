package com.AaronGoidel.mka.practice.money_calculator;

import java.util.Random;
import java.text.DecimalFormat;

/**
 * Created by agoidel2019 on 10/10/16.
 */
public class MoneyGen
{
    private Random random = new Random();

    DecimalFormat format = new DecimalFormat("##.00");


    public double randomMoney(int min, int max) throws java.text.ParseException
    {
        String moneyVal = format.format(min + (max - min) * random.nextDouble());
        return (Double) format.parse(moneyVal);
    }
}
