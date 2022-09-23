package com.cogent.numbers;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the number upto which you want to have sum calculated");
        int upto = scnr.nextInt();

        int totalSum = 0;
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i <= upto; i++){
            if (i%2 == 0){
                evenSum = evenSum + i;
            }
            if (i%2 != 0){
                oddSum = oddSum + i;
            }
        }
        totalSum = evenSum + oddSum;
        System.out.println("Sum of even numbers that is upto " + upto + ": " + evenSum);
        System.out.println("Sum of odd numbers that is upto " + upto + ": " + oddSum);
        System.out.println("Total sum of numbers that is upto " + upto + ": " + totalSum);
    }
}
