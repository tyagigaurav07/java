package RD.LoopsQ;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter the number ");
        int num = x.nextInt();

        int sum = calculateDigitSum(num);

        System.out.println("Sum of digits in " + num + " is: " + sum);

        x.close();
    }

    public static int calculateDigitSum(int num) {
        num = Math.abs(num);

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;

            num /= 10;
        }

        return sum;
    }
}

