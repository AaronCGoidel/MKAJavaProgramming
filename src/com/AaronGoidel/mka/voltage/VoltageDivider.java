package com.AaronGoidel.mka.voltage;

/**
 * Created by agoidel2019 on 11/17/16.
 */
public class VoltageDivider
{
    private Resistor r1;
    private Resistor r2;

    //default constructor makes two new resistors
    public VoltageDivider()
    {
        r1 = new Resistor();
        r2 = new Resistor();
    }

    //constructor takes in two resistors
    public VoltageDivider(Resistor first, Resistor second)
    {
        r1 = first;
        r2 = second;
    }

    //calculate nominal gain
    public double getNominalGain()
    {
        return r2.getNominalResistance() / (r1.getNominalResistance() * r2.getNominalResistance());
    }

    //calculates actual gain
    public double getActualGain()
    {
        return r2.getActualResistance() / (r1.getActualResistance() * r2.getActualResistance());
    }

    public static void main (String[] args)
    {
        //super accurate circuit simulator, simply number of steps in circuit
       int circuit = 10;

        //pretty formatting for output
        System.out.printf(" %2s %15s %18s %n", " #", "Nominal Gain", "Actual Gain");

        //loops over "circuit". A.K.A: how many times to run simulation
        for (int i = 1; i <= circuit; i++)
        {
            //makes new resistors of 250Ω and 750Ω respectively with a tolerance of ±5Ω each
            Resistor resistor1 = new Resistor(250, 5);
            Resistor resistor5 = new Resistor(750, 5); //called this one resistor5 just for kicks, keeping everyone on edge I'm kinda the master of code suspense

            //makes new divider using the resistors created above
            VoltageDivider divider = new VoltageDivider(resistor1, resistor5);

            System.out.printf(" %2s %11s %25s %n", i, divider.getNominalGain(), divider.getActualGain());
        } //<----- Curly brace, for closing the current loop.
    }
}
