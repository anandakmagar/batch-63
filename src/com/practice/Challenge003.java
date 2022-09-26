package com.practice;

// This is to check whether the number is a prime number or not

public class Challenge003 {
    public void checkPrime(int num){
        boolean result = false;
        if (num <= 1){
            result = false;
        }
        else if (num == 2){
            result = true;
        }
        else {
            for (int i = 3; i <= num/2; i++){
                if (num%i == 0){
                    result = false;
                }
                else {
                    result = true;
                }
            }
        }
        if (result == true){
            System.out.println("Prime");
        }
        if (result == false){
            System.out.println("Not a prime");
        }
    }

    public static void main(String[] args) {
        Challenge003 c = new Challenge003();
        c.checkPrime(100);
    }
}
