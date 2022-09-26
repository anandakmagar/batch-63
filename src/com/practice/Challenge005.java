package com.practice;

public class Challenge005 {
    public void multiplication(int num1, int num2){
        for (int i = 1; i <= num2; i++){
            System.out.println(num1 + " x " + i + " = " + num1*i);
        }
    }
    public static void main(String[] args) {
        Challenge005 c = new Challenge005();
        c.multiplication(2, 10);
    }
}
