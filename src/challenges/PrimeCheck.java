package challenges;

import java.util.Scanner;

public class PrimeCheck {
    boolean prime = false;
    static boolean primeCheck(int n){
        for (int i = 2; i <= n/2; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter your number upto which you want to check for the prime number");
        int num = scnr.nextInt();

        if (primeCheck(num)){
            System.out.println("Its a PRIME");
        }
        else {
            System.out.println("Its NOT a prime");
        }
    }
}
