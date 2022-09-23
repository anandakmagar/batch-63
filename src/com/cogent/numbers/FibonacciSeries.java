package com.cogent.numbers;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter a number greater than 3");
        int n = scnr.nextInt();

        if (n < 3) {
            System.out.println("Invalid! Please enter a number greater than 3");
        } else {
            int[] array = new int[n];

            System.out.println("Enter numbers of length " + n);
            for (int i = 0; i < n; i++) {
                array[i] = scnr.nextInt();
            }

            boolean fibonacci = true;
            for (int j = 2; j < array.length; j++) {
                if (array[j] == array[j - 1] + array[j - 2]) {
                    fibonacci = true;
                } else {
                    fibonacci = false;
                }
            }
            if (fibonacci == true) {
                System.out.println("It is a fibonacci");
            } else {
                System.out.println("It is not a fibonacci");
            }
        }
    }
}
