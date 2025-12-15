package com.JavaPrograms;

import java.util.Scanner;
public class Cal {
    public static void main(String[] args) {
        System.out.println("Total marks of all subjects");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks of hindi :");
        int maths = scan.nextInt();
        System.out.println("Enter the marks of english :");
        int science = scan.nextInt();
        System.out.println("Enter the marks of maths :");
        int english = scan.nextInt();
        System.out.println("Enter the marks of computer :");
        int computer = scan.nextInt();
        System.out.println("Enter the marks of science :");
        int hindi = scan.nextInt();

        int sum = maths + science + english + computer + hindi;
        float per = sum * 100 / 500;
        System.out.println("Total marks of all subjects are:");
        System.out.println(sum);
        System.out.println("your percentage is:");
        System.out.println(per+"%");


    }
}
