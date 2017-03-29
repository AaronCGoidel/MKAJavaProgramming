package com.AaronGoidel.mka.practice.IO;

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

        if (!"exit".equalsIgnoreCase(name)) // creates new file with name user inputs
        {
            file = new File(name);
        }

        try
        {
            Scanner readFile = new Scanner(file); // tries to read file

            while (readFile.hasNext()) // prints out file contents
            {
                System.out.println(readFile.nextLine());
            }
        }catch (FileNotFoundException oops){ // if the file does not exist run open method again
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
