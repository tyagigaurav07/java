package RD.LoopsQ;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = sc.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = sc.nextInt();

        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + ":");
        for (int num = lowerBound; num <= upperBound; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num <= 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
