package challenges;

import java.util.Scanner;

public class DigitAdds {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter your number containing more than one digit");
        int num = scnr.nextInt();

        int sum = 0;
        while (num != 0){
            int remainder = num%10;
            sum = sum + remainder;
            num = num/10;
        }
        System.out.println("Sum: " + sum);
    }
}
