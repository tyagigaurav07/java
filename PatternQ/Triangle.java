package RD.PatternQ;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = x.nextInt();
        System.out.println("Triangle Result");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        x.close();
    }
}
