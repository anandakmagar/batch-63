package challenges;

import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the number for finding the factorial");
        int num = scnr.nextInt();

        int factorial = 1;
        for (int i = num; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println(num + "! = " + factorial);
    }
}
