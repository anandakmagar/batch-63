package com.practice;

public class Challenge004 {
    int evenSum = 0;
    int oddSum = 0;
    public int evenAdd(int num) {
        int evenSum = 0;
        while (num != 0) {
            int remainder = num % 10;
            if (num%2 == 0) {
                evenSum = evenSum + remainder;
            }
            num = num/10;
        }
        return evenSum;
    }

    public int oddAdd(int num){
        int oddSum = 0;
        while (num != 0){
            int remainder = num%10;
            if (num%2 != 0){
                oddSum = oddSum + remainder;
            }
            num = num/10;
        }
        return oddSum;
    }

    public static void main(String[] args) {
        Challenge004 c = new Challenge004();
        System.out.println(c.evenAdd(2345));
        System.out.println(c.oddAdd(2345));
        System.out.println(c.evenAdd(2345) + c.oddAdd(2345));
    }
}
