package com.cogent.iohandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOFileWriting {
    public static void main(String[] args) {
        String data = "Welcome to Cogent";
        try{
            FileOutputStream fos = new FileOutputStream("output.txt");
            byte[] array = data.getBytes();
            fos.write(array);
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe);
            fnfe.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
