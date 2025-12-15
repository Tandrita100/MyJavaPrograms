package com.JavaPrograms;
import java.util.Scanner;
public class Calc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Enter an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Subtraction");
            System.out.println("4. Division");
            System.out.println("5. Convert to Absolute");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Addition(scanner);
                    break;
                case 2:
                    Multiplication(scanner);
                    break;
                case 3:
                    Subtraction(scanner);
                    break;
                case 4:
                    Division(scanner);
                    break;
                case 5:
                    convertToAbsolute(scanner);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }

       // scanner.close();
    }

     static void Addition(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    static void Multiplication(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

     static void Subtraction(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

     static void Division(Scanner scanner) {
        System.out.print("Enter the 1st no. : ");
        double dividend = scanner.nextDouble();

        System.out.print("Enter the 2nd no. : ");
        double divisor = scanner.nextDouble();

        if (divisor != 0) {
            double result = dividend / divisor;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

     static void convertToAbsolute(Scanner scanner) {
        System.out.print("Enter the number: ");
        double number = scanner.nextDouble();

        double result = Math.abs(number);
        System.out.println("Result: " + result);
    }
}
