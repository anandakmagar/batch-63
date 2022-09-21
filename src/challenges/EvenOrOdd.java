package challenges;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scnr.nextInt();
        if (num != 0 && num%2 == 0){
            System.out.println("It is a even number");
        }
        if (num%2 != 0){
            System.out.println("It is an odd number");
        }
    }
}
