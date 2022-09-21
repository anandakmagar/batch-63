package challenges;

import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = scnr.nextInt();
        System.out.println("Enter second number");
        int b = scnr.nextInt();

        System.out.println("Original a,b: " + a + ", " + b);

        int c = 0; // temporary variable
        if (a != b){
            c = a;
            a = b;
            b = c;

            System.out.println("After swapping a,b: " + a + ", " + b);
        }
    }
}
