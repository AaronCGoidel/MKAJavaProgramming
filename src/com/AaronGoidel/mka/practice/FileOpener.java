package com.AaronGoidel.mka.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by agoidel2019 on 2/22/17.
 */
public class FileOpener
{
    public static void open()
    {
        Scanner fileName = new Scanner(System.in);

        System.out.println("Enter the path/name of the file you wish to open");
        String name = fileName.next();

        File file = null;

        if (!"exit".equalsIgnoreCase(name))
        {
            file = new File(name);
        }

        try
        {
            Scanner readFile = new Scanner(file);

            while (readFile.hasNext())
            {
                System.out.println(readFile.nextLine());
            }
        }catch (FileNotFoundException oops){
            open();
        }catch (NullPointerException exit){ // if 'exit' was the input file is still set to null thus throwing a NPE
            System.out.println("Goodbye!");
        }
    }

    public static void main(String[] args)
    {
        open();
    }
}
