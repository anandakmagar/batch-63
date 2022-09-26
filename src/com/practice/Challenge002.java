package com.practice;

// Reversing a integer
// There are two ways I could use
// 1. Using the modulo
// 2. Converting the int into String and looping from the backward

public class Challenge002 {

    // Approach 1
//    int reverse(int num){
//        int reverse = 0;
//        while (num != 0){
//            int remainder = num%10;
//            reverse = reverse * 10 + remainder;
//            num = num/10;
//        }
//        return reverse;
//    }

    // Approach 2
    int reverse (int num){
        // This changes the num's data type to string
        String s = Integer.toString(num);
        String rev = "";
        int reverse = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            rev = rev + s.charAt(i);
            // Converting reverse to int type
            reverse = Integer.parseInt(rev);
        }
        return reverse;

    }

    public static void main(String[] args) {
        Challenge002 c = new Challenge002();
        System.out.println(c.reverse(1234560789));
    }
}
