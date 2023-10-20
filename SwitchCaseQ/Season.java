package RD.SwitchCaseQ;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month (e.g., January, February, etc.): ");
        String month = scanner.nextLine().toLowerCase();

        switch (month) {
            case "december":
            case "january":
            case "february":
                System.out.println(month + " is in the winter season.");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println(month + " is in the spring season.");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println(month + " is in the summer season.");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println(month + " is in the fall season.");
                break;
            default:
                System.out.println("Invalid input. Please enter a valid month.");
                break;
        }
        scanner.close();
    }
}
