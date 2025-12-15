package com.practice;
import java.util.Scanner;

public class Exercise1CalculatePer {
    public static void main(String[] args) {

        System.out.println("This is a Calculator to calculate Percentage.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks of English: ");
        int a = scan.nextInt();
        System.out.println("Enter the marks of Maths: ");
        int b = scan.nextInt();
        System.out.println("Enter the marks of Computer: ");
        int c = scan.nextInt();
        System.out.println("Enter the marks of Science: ");
        int d = scan.nextInt();
        System.out.println("Enter the marks of Social Science: ");
        int e = scan.nextInt();
        int avg = a+b+c+d+e/5;
        System.out.println("Your Average marks is " + avg + ".");
        int per = (avg*100) /500;
        System.out.println("Your Percentage is " + per + "%");


    }
}
