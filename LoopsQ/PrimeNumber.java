package RD.LoopsQ;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        {
            System.out.println("Enter the number=");
            int i, m = 0, f = 0;
            int n = a.nextInt();
            m = n / 2;
            if (n == 0 || n == 1) {
                System.out.println(n + " is not a prime number");
            } else {
                for (i = 2; i <= m; i++) {
                    if (n % i == 0) {
                        System.out.println(n + " is not a prime");
                        f = 1;
                        break;
                    }
                }
                if (f == 0) {
                    System.out.println(n + " is prime number");
                }
            }
            a.close();
        }
    }

}
