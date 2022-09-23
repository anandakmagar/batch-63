package com.cogent.numbers;

import java.util.Scanner;

public class NumberSwapWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = scnr.nextInt();
        System.out.println("Enter the second number");
        int num2 = scnr.nextInt();

        System.out.println("Original Numbers: num1, num2 " + num1 + ", " + num2);

        if (num1 != num2){
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;
        }
        System.out.println("Swapped numbers: num1, num2: " + num1 + ", " + num2);
    }
}
