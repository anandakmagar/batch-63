package com.practice;

import java.util.Scanner;

public class Challenge008 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the lengths of the numbers");
        int length = scnr.nextInt();
        System.out.println("Enter the numbers");
        int[] array = new int[length];
        for (int i = 0; i < length; i++){
            array[i] = scnr.nextInt();
        }
        boolean result = false;
        for (int j = 3; j < array.length; j++){
            if (array[j] == (array[j - 1]  + array[j - 2])){
                result = true;
            }
            else {
                result = false;
            }
        }

        if (result == true){
            System.out.println("Fibonacci");
        }
        if (result == false){
            System.out.println("Not Fibonacci");
        }
    }
}
