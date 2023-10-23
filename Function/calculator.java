package RD.functionQ;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 to Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                break;
            }

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + add(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + multiply(num1, num2));
                        break;
                    case 4:
                        double result = divide(num1, num2);
                        if (Double.isNaN(result)) {
                            System.out.println("Cannot divide by zero.");
                        } else {
                            System.out.println("Result: " + result);
                        }
                        break;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid option.");
            }
        }
        scanner.close();
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y == 0) {
            return Double.NaN; 
        }
        return x / y;
    }
}
