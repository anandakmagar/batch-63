package com.cogent.numbers;

import java.util.Scanner;

public class BiggerNumberAmongThree {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = scnr.nextInt();
        System.out.println("Enter second number");
        int b = scnr.nextInt();
        System.out.println("Enter second number");
        int c = scnr.nextInt();

        if (a > b && a > c){
            System.out.println("First number is the biggest");
        }
        if(b > a && b > c){
            System.out.println("Second number is the biggest");
        }
        if (c > b && c > a){
            System.out.println("Third number is the biggest");
        }



    }
}
