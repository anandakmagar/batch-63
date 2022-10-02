package com.cogent.iohandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOFileReading {
    public static void main(String[] args) {
        String fileName = "output.txt";
        try{
            FileInputStream fis = new FileInputStream(fileName);
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe);
            fnfe.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
