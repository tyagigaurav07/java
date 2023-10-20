package RD.Function;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0, digits = 0;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (Math.pow(digit, digits));
            temp /= 10;
        }
        if (n == sum) {
            System.out.print(n + " is a armstrong number");
        } else {
            System.out.print(n + " is not armstron number");
        }
        sc.close();
    }
}
