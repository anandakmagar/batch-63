package com.practice;

public class Challenge006 {
    public void swap(int num1, int num2){
        int temp = 0;
        if (num1 != num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
    public static void main(String[] args) {
        Challenge006 c = new Challenge006();
        c.swap(4, 5);
    }
}
