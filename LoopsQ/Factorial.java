package RD.LoopsQ;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = x.nextInt();

        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println(num + "! = " + fact);

        x.close();
    }
}
