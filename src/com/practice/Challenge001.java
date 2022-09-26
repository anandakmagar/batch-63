package com.practice;

// Reversing a string

public class Challenge001 {
    String reverse(String s){
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--){
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        Challenge001 c = new Challenge001();
        System.out.println(c.reverse("Ananda"));
    }

}
