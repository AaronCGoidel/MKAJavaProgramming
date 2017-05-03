package com.AaronGoidel.mka.voltage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by agoidel2019 on 4/27/17.
 */
public class BatteryTester
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("BatteryVoltages.txt"); // Use test file

        Scanner readFile = new Scanner(file); // Scanner for file in

        // counters
        int totalBats = 0;
        float totalVolts = 0;
        int goodBats = 0;
        int duds = 0;

        while (readFile.hasNext()) // Loop over numbers in file
        {

            totalBats += 1; // increase total batteries tested
            float current = readFile.nextFloat(); // read current voltage
            if (current < 0) // check if current value is not expected value
            {
                System.out.format("#%d Is A Dud\n", totalBats); // print dud was found
                duds++; // increase total number of duds found
                continue; // go to next entry
            }
            System.out.format("#%d Is Good. Voltage: %.3fvolts\n", totalBats, current); // print good battery was found
            goodBats++; // increase number of good batteries found
            totalVolts += current; // add current voltage to total
        }

        System.out.format("\nTotal Batteries Tested: %d \nGood Batteries: %d \nDuds Found: %d \nAverage Voltage: %fvolts"
                ,totalBats, goodBats, duds, totalVolts/goodBats); // print data
    }
}
