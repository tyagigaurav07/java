package RD.SwitchCaseQ;

import java.util.Scanner;

public class SimpleTraffic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String currentLight = "Red"; // Initial state is Red

        while (true) {
            System.out.println("Current Traffic Light: " + currentLight);
            System.out.println("1. Change to the next state");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    switch (currentLight) {
                        case "Red":
                            currentLight = "Green";
                            break;
                        case "Green":
                            currentLight = "Yellow";
                            break;
                        case "Yellow":
                            currentLight = "Red";
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Exiting Traffic Light Simulator.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
