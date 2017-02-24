package com.AaronGoidel.mka.voltage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by agoidel2019 on 2/16/17.
 */
public class CapFile
{
    private double B, R, C, start, end, stepSize;

    CapFile(double B, double R, double C, double startT, double endT)
    {
        this.B = B;
        this.R = R;
        this.C = C;
        this.start = startT;
        this.end = endT;
        this.stepSize = (this.end - this.start)/100;
    }

    public double getB()
    {
        return B;
    }

    public double getC()
    {
        return C;
    }

    public double getEnd()
    {
        return end;
    }

    public double getR()
    {
        return R;
    }

    public double getStart()
    {
        return start;
    }

    public double getStepSize()
    {
        return stepSize;
    }

    private double voltsAcrossCap(double t)
    {
        return B * (1 - Math.pow(Math.E, (-t/(R * C))));
    }

    private static List<Double> getInput() throws FileNotFoundException
    {
        File paramFile = new File("params.txt");
        Scanner inFile = new Scanner(paramFile);
        List<Double> params = new ArrayList<Double>();

        while (inFile.hasNextLine())
        {
            String line = inFile.nextLine();
            String[] tokens = line.split("=");
            params.add(Double.parseDouble(tokens[1]));
        }
        return params;
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        List<Double> parameters = getInput();
        CapFile capacitor = new CapFile(parameters.get(0), parameters.get(1), parameters.get(2), parameters.get(3), parameters.get(4));

        Scanner filePath = new Scanner(System.in);
        Writer writer;
        try
        {
            FileWriter outFile = new FileWriter(filePath.nextLine());
            writer = new BufferedWriter(outFile);

            for(double t = capacitor.getStart(); t <= capacitor.getEnd(); t += capacitor.getStepSize())
            {
                writer.write("t:" + t + " = " + capacitor.voltsAcrossCap(t) + "\n");
                System.out.println("SUCCESS! LINE WRITTEN");
            }
            writer.close();
        } catch (IOException oops)
        {
            oops.printStackTrace();
        }
    }
}
