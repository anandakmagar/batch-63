package com.cogent.arrays;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 0, 4, 35, 30};

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        int num = scnr.nextInt();

        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                result = true;
                break;
            }
        }
        if (result){
            System.out.println("Yes! It exists");
        }
        else {
            System.out.println("No! It doesn't exist");
        }
    }
}
