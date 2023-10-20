package RD.LoopsQ;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] charCount = new int[128];

        for (char c : input.toCharArray()) {
            charCount[c]++;
        }

        System.out.println("Character Counts:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println("'" + (char) i + "': " + charCount[i]);
            }
        }

        sc.close();
    }
}
