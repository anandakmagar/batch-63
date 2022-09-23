package com.cogent.numbers;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter your number to check whether it is a prime number");
        int num = scnr.nextInt();

        boolean isPrime = true;
        if(num <= 1) {
            isPrime = false;
        }
        else {
            for(int i = 2; i <= num/2; i++) {
                if(num%i == 0) {
                    isPrime = false;
                }
                else {
                    isPrime = true;
                }
            }
        }

        if(isPrime == false) {
            System.out.println("It is not a prime number");
        }
        if(isPrime == true) {
            System.out.println("It is a prime number");
        }
    }
}
