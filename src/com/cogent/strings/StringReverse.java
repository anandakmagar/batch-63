package com.cogent.strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the string you want to reverse");
        String s = scnr.next();

        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--){
            reverse = reverse + s.charAt(i);
        }
        System.out.println("Reversed string: " + reverse);
    }
}
