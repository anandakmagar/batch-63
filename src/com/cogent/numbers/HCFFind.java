package com.cogent.numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class HCFFind {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = scnr.nextInt();
        System.out.println("Enter the second number");
        int num2 = scnr.nextInt();

        int num3 = 0;
        if(num1 > num2) {
            num3 = num1/2;
        }
        else {
            num3 = num2/2;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 1; i <= num3; i++) {
            if(num1%i == 0 && num2%i == 0) {
                arrayList.add(i);
            }
        }
        int hcf = 0;
        for(int i = 0; i < arrayList.size(); i++) {
            for(int j = i+1; j < arrayList.size(); j++) {
                if(arrayList.get(i) > arrayList.get(j)) {
                    hcf = arrayList.get(i);
                }
                else {
                    hcf = arrayList.get(j);
                }
            }
        }
        System.out.println("The Highest Common Factor is " + hcf);
    }
}
