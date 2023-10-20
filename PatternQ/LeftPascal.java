package RD.PatternQ;

import java.util.Scanner;

public class LeftPascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size value : ");
        int n = sc.nextInt();
        int mid = n / 2;
        int totalspace = mid;
        // int totalstar = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= totalspace; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // if (n < mid) {
            //     totalstar++;
            //     totalspace--;
            // } else {
            //     totalstar--;
            //     totalspace++;
            // }
            System.out.println();
        }
        sc.close();
    }
}
