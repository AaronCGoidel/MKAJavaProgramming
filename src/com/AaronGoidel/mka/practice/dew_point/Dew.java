package com.AaronGoidel.mka.practice.dew_point;

/**
 * Created by agoidel2019 on 10/10/16.
 */

public class Dew
{
    final double A = 17.27;
    final double B = 237.7;

    private static double celsiusToFahrenheit(double cTemp)
    {
        return cTemp * 1.8 + 32;
    }

    private double f (double t, double rh)
    {
        return (A * t)/(B + t) + Math.log(rh);
    }

    private double dewCalculator(double temp, double humidity)
    {
        return (B * f(temp, humidity))/(A - f(temp, humidity));
    }

    public static void main(String args[])
    {
        Dew dewPoint = new Dew();

        int startTemp = 40;
        float startHumidity = 0.2f;

        float curHumid;
        int curTemp;


        for (int i = 0; i < 7; i++)
        {
            curTemp = startTemp + (i * 10);

            for (int j = 0; j < 6; j++)
            {
                curHumid = startHumidity * j;

                System.out.println("Temp: " + curTemp + " Humidity: " + curHumid + " Dew Point: " + celsiusToFahrenheit(dewPoint.dewCalculator(curTemp, curHumid)));
            }
        }
    }

}
