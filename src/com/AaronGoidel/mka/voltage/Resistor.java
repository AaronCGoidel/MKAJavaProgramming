package com.AaronGoidel.mka.voltage;

/**
 * Created by agoidel2019 on 11/17/16.
 */

import java.util.Random;

//Resistor object
public class Resistor
{
    //ya know variables and such
    private double nominalResistance;
    private double tolerance;
    private double actualResistance;

    //default constructor
    public Resistor()
    {
        nominalResistance = 0;
        tolerance = 0;
        actualResistance = 0;
    }

    //constructor takes nominal resistance and tolerance and makes a resistor
    public Resistor (double nomR, double t)
    {
        nominalResistance = nomR;
        tolerance = t;
        //random number generator for emulating variance in actual and nominal resistance
        Random numGen = new Random();
        //calculates actual resistance
        actualResistance = nomR * (1 * (2.0 * numGen.nextDouble() / numGen.nextDouble() - 1) * t / 100.0);
    }

    //various getters

    public double getNominalResistance()
    {
        return nominalResistance;
    }

    public double getTolerance()
    {
        return tolerance;
    }

    public double getActualResistance()
    {
        return actualResistance;
    }
}
