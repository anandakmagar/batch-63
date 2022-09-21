package challenges;


import java.util.Scanner;

public class IntegerReverse {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int num = scnr.nextInt();
        System.out.println("Original: " + num);

        int reverse = 0;
        while (num != 0){
            int remainder = num%10;
            reverse = reverse*10 + remainder;
            num = num/10;
        }

        System.out.println("Reversed: " + reverse);
    }
}
