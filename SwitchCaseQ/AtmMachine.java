package RD.SwitchCaseQ;

import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00; // Shuruaati account balance

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Balance Dekho");
            System.out.println("2. Paise Jama Karo");
            System.out.println("3. Paise Nikalo");
            System.out.println("4. Exit");
            System.out.print("Apna chunav karen: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Aapka balance ₹" + balance + " hai");
                    break;
                case 2:
                    System.out.print("Jama karne ke liye rupaye daale: ₹");
                    double jamaAmount = scanner.nextDouble();
                    if (jamaAmount > 0) {
                        balance += jamaAmount;
                        System.out.println("₹" + jamaAmount + " safalta purvak jama kiye gaye.");
                    } else {
                        System.out.println("Anvalid jama raashi.");
                    }
                    break;
                case 3:
                    System.out.print("Nikaalne ke liye rupaye daale: ₹");
                    double nikaalAmount = scanner.nextDouble();
                    if (nikaalAmount > 0 && nikaalAmount <= balance) {
                        balance -= nikaalAmount;
                        System.out.println("₹" + nikaalAmount + " safalta purvak nikaal liye gaye.");
                    } else {
                        System.out.println("Anvalid nikaalne ki raashi ya anupat dhan mein kami.");
                    }
                    break;
                case 4:
                    System.out.println("ATM ka istemal karne ke liye dhanyavaad. Alvida!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Anvalid chunav. Kripya punah prayas karen.");
                    break;
            }
        }
    }
}
