package challenges;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = scnr.nextInt();

        int sum = 0;
        while (a != 0){
            a = a%10;
            sum = sum * 10 + a;
            a = a/10;
            a ++;
        }
        System.out.println(sum);


    }
}
