package com.JavaPrograms;

import java.util.Scanner;

public class USER_input {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("enter 1st no.");
      //  int a = scan.nextInt();
        float a = scan.nextFloat();

        System.out.println("second 2nd no.");
       // int b = scan.nextInt();
        float b = scan.nextFloat();
       // int sum = a + b;
        float sum = a + b;
        System.out.println("the sum of these no. is:\n" + sum);
        System.out.println("the sum of these no. is:\r" + sum);
        System.out.println(sum);

        //code2
        Scanner scan1 = new Scanner (System.in);
        System.out.println("Hi, what is your name?");
        String name = scan1.nextLine();
        System.out.println("Hello " + name + " !!!");
        System.out.println("Enter your password:");
        int password = scan1.nextInt();
        System.out.print("welcome " + name + " :)");
       // System.out.print(password);
       // System.out.println(System.out);

    }

}

//code2

//public class USER_input {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner (System.in);
//        System.out.println("Hi, what is your name?");
//        String name = scan.nextLine();
//        System.out.println("Hello " + name);
//        System.out.println("Enter your password:");
//        int password = scan.nextInt();
//        System.out.print("Your password is:" );
//        System.out.print(password);
//
//    }
//}