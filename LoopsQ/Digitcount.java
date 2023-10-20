package RD.LoopsQ;

import java.util.Scanner;

public class Digitcount {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = x.nextInt();
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Exist digit in a number " + count);
        x.close();
    }

}
