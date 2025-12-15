package com.JavaPrograms;

import java.util.Scanner;

public class operators {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        //arithmetic operators

        System.out.println("enter 1st no.");
        int a = scan.nextInt();
        System.out.println("enter 2nd no.");
        int b = scan.nextInt();
        int sum = a+b;
        System.out.println(sum);
        int difference = a-b;
        System.out.println(difference);
        int product = a*b;
        System.out.println(product);
        int division = a/b;
        System.out.println(division);
        int modulus = a%b;
        System.out.println(modulus);

        //increment decrement operators

//        int d = 5;
//        int inc = ++d;
//        System.out.println(inc);
//        int dec = --d;
//        System.out.println(dec);


        //assignment operators

//        int c = 10;
//        c += 5;
//        System.out.println(c);
//        c -= 2;
//        System.out.println(c);
//        c *= 2;
//        System.out.println(c);
//        c /= 2;
//        System.out.println(c);
//        c %= 20;
//        System.out.println(c);
//        c &= 20;
//        System.out.println(c);
//        c |= 20;
//        System.out.println(c);
//        c ^= 20;
//        System.out.println(c);
//        c >>= 20;
//        System.out.println(c);
//        c <<= 20;
//        System.out.println(c);

        //Comparison Operators

        System.out.println("\nenter 1st no.");
        int e = scan.nextInt();
        System.out.println("enter 2nd no.");
        int f = scan.nextInt();
        System.out.println(e>f);
        System.out.println(e<=f);
        System.out.println(e<f);
        System.out.println(e>=f);

        //Logical Operators

        System.out.println("\nenter a no.");
        int g = scan.nextInt();
        //and
        System.out.println( g < 5 &&  g < 10);
        //or
        System.out.println( g < 5 || g < 4 );
        //not
        System.out.println(  !(g < 5 && g < 10) );

    }
}
