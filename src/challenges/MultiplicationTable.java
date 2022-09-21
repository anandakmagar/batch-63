package challenges;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the number for which you want to create the multiplication table");
        int num = scnr.nextInt();
        System.out.println("Enter the number upto which you want to create the multiplication table");
        int upto = scnr.nextInt();

        for(int i = 1; i <= upto; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
