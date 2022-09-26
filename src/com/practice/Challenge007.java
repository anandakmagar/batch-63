package com.practice;

public class Challenge007 {
    public void digitAdd(int num){
        int sum = 0;

        while (num > 0) {
            int remainder = num%10;
            sum = sum + remainder;
            num = num / 10;
        }
        System.out.println("Sum: " + sum);
    }
    public static void main(String[] args) {
        Challenge007 c = new Challenge007();
        c.digitAdd(1234);
    }
}
