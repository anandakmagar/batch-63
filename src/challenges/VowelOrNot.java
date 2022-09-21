package challenges;

import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter your character");
        String a = scnr.next();
        if (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("0") || a.equals("u")){
            System.out.println("It's a vowel");
        }
        else {
            System.out.println("It's not a vowel");
        }
    }
}
