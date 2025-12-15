package com.practice;
import java.util.Scanner;

public class PracticeSet1 {
    public static void main(String[] args) {

        //Problem1
        int a = 40;
        short b = 20;
        float c = 40.0f;
        float sum = a+b+c;
        System.out.println("The sum of these numbers is " + sum);

        System.out.println();

        //Problem2
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks of English: ");
        int d = scan.nextInt();
        System.out.println("Enter the marks of Maths: ");
        int e = scan.nextInt();
        System.out.println("Enter the marks of Computer: ");
        int f = scan.nextInt();
        int avg = d+e+f/3;
        System.out.println("Your Average marks is " + avg + ".");
        int per = (avg*100) /300;
        System.out.println("Your Percentage is " + per + "%");
        float CGPA = per/9.5f;
        System.out.println("Your CGPA is " + CGPA);

        System.out.println();

        //Problem3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.next();
        System.out.println( "Hello " + name + ", have a good day.");

        System.out.println();

        //Problem4
        int Km = 2;
        float miles = Km / 1.609f;
        System.out.println(Km + " Km in miles is " + miles);

        System.out.println();

        //Problem5
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number");
        boolean num = s.hasNextInt();
        System.out.println(num);

    }
}
