package com.AaronGoidel.mka.practice.IO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by agoidel2019 on 2/28/17.
 */
public class IOResources
{
    public static void main(String[] args)
    {
        try(Scanner in = new Scanner(new File("file.txt")))
        {
            while(in.hasNext())
            {
                System.out.println(in.nextLine());
            }
        }catch (IOException oops){
            oops.printStackTrace();
        }
    }
}
