package RD.PatternQ;

import java.util.Scanner;

public class Rohmbus {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Value : ");
        int n = x.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        x.close();
    }
}
