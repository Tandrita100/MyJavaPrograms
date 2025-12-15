package com.JavaPrograms;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        float a, b, result;
        int operator;
        boolean exit = false;
        System.out.println("This is a calculator");
        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter the first no. :");
//        int a = scan.nextInt();
//        System.out.println("Enter the second no. :");
//        int b = scan.nextInt();
//        System.out.println("Choose the operation- +,-,*,/, absolute");

        while (!exit) {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("\nEnter Your operator (1-4): ");
            operator = scan.nextInt();

            if (operator >= 1 && operator <= 4) {
                System.out.print("\nEnter 1st Number: ");
                a = scan.nextFloat();
                System.out.print("\nEnter 2nd Number: ");
                b = scan.nextFloat();

                if (operator == 1)
                    result = a + b;
                else if (operator == 2)
                    result = a - b;
                else if (operator == 3)
                    result = a * b;
                else
                    result = a / b;

                System.out.println("\nResult = " + result);
                System.out.println("");
            } else
                System.out.println("\nInvalid Choice!");
        }
    }
}

//    }
//}