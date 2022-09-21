package challenges;

import java.util.Scanner;

public class BiggerNumberAmongTwo {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = scnr.nextInt();
        System.out.println("Enter second number");
        int b = scnr.nextInt();

        boolean result = a < b;
        boolean result2 = a == b;
        if (result){
            System.out.println("Second number " + b + " is bigger than " + a);
        }
        else if (result2){
            System.out.println("These numbers are equal");
        }
        else {
            System.out.println("First number " + a + " is bigger than second number " + b);
        }
    }
}
