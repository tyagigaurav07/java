package RD.PatternQ;

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = x.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
        x.close();
    }
}
