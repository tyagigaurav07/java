package RD.PatternQ;

import java.util.Scanner;

public class HollowTriangle {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = x.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; i++) {
                if (i == 1 || i == j || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.err.println("*");
        }
        x.close();
    }
}
