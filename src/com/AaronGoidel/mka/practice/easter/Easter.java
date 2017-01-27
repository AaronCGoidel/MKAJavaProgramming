package com.AaronGoidel.mka.practice.easter;

/**
 * Created by agoidel2019 on 10/10/16.
 */
import java.util.Scanner;

class Easter
{
    public static void main(String[] args)
    {
        System.out.print("Please enter a year:\n>");
        Scanner s = new Scanner(System.in);
        int inputted = getResult(s);
        while(inputted <= 0)
        {
            System.out.print("Years tend to be positive... Try again:\n>");
            inputted = getResult(s);
        }
        System.out.println(getDate(inputted));
    }

    private static int getResult(Scanner s)
    {
        while(!s.hasNextInt())
        {
            System.out.print("That's not a real year... Try again:\n>");
            s.nextLine();
        }
        return s.nextInt();
    }

    public static String getDate(int year)
    {
        // I know this is awful, gross, form but I did this kinda short hand so...
        int a = year % 19,
                b = year / 100,
                c = year % 100,
                d = b / 4,
                e = b % 4,
                g = (8 * b + 13) / 25,
                h = (19 * a + b - d - g + 15) % 30,
                j = c / 4,
                k = c % 4,
                m = (a + 11 * h) / 319,
                r = (2 * e + 2 * j - k - h + m + 32) % 7,
                n = (h - m + r + 90) / 25,
                p = (h - m + r + n + 19) % 32;

        String result;
        switch(n)
        {
            // Same here. I know this should never be written.
            case 1:
                result = "January ";
                break;
            case 2:
                result = "February ";
                break;
            case 3:
                result = "March ";
                break;
            case 4:
                result = "April ";
                break;
            case 5:
                result = "May ";
                break;
            case 6:
                result = "June ";
                break;
            case 7:
                result = "July ";
                break;
            case 8:
                result = "August ";
                break;
            case 9:
                result = "September ";
                break;
            case 10:
                result = "October ";
                break;
            case 11:
                result = "November ";
                break;
            case 12:
                result = "December ";
                break;
            default:
                result = "error";
        }

        return result + p;
    }
}
