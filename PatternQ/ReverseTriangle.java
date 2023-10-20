package RD.PatternQ;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = x.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        x.close();
    }
}
