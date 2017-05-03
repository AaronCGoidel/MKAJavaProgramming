package com.AaronGoidel.mka.practice.IO;


import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;


/**
 * Created by agoidel2019 on 3/29/17.
 */

public class ByteStreamPractice
{
    public static void main(String[] args) throws IOException
    {
        RandomAccessFile inputFile = new RandomAccessFile("data_byte.dat", "r");

        File outputFile = new File("data_out.dat");
        DataOutputStream outFile = new DataOutputStream(new FileOutputStream(outputFile));

        PrintWriter z = new PrintWriter(System.out, true);



        long x = 0;
        long pos = 0;
        boolean end = false;
        while (!end)
        {
            try
            {
                inputFile.seek(pos);
                x = inputFile.readLong();
                System.out.println(x);
                outFile.writeLong(x);
                pos += 16;
            } catch (EOFException woops)
            {
                end = true;
            }
        }
        outFile.close(); out.flush(); out.close();
    }
}
