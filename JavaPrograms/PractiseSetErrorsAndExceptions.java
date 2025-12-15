package com.JavaPrograms;

import java.util.Scanner;

class MaximumRetryException extends Exception{
    @Override
    public String toString() {
        return "cannot exceed the limit..";
    }
    public String GetMessage() {
        return "cannot exceed this limit...";
    }
}
public class PractiseSetErrorsAndExceptions {
    public static int div(int a , int b) throws MaximumRetryException{
        return a/b;
    }
    public static void main(String[] args) {

        //Problem 1

        /*
        Syntax error -
        int a = 4
        b = 600;
         */

        //Logical error -
        int age = 34;
        int year_born = 2000 - 34;   // the logic is wrong here to calculate the year born, it should be 2023(current year)-34(age).

        //Runtime error -
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();     // if i input an alphabet it will cause a runtime error.

        System.out.println();

        //Problem 2
        try{
            int b = 6/0;
            System.out.println(b);
        }catch(ArithmeticException e){
            System.out.println("Haha " + e);
        }catch(IllegalArgumentException e){
            System.out.println("Hehe");
        }

        System.out.println();

        //Problem 3 + 4 + 5
        boolean b = true;
        int [] marks = new int[3];
        marks[0] = 78;
        marks[1] = 88;
        marks[2] = 68;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an index:");
        int i = 0;
        while(b && i<5){
            try{
                int Index = scan.nextInt();
                System.out.println("the value of marks[index] is " + marks[Index]);
                break;
            }catch(Exception e){
                System.out.println("Invalid....Error...Occurred..");
                i++;
            }
        }
        if(i>=5){
            try{
                throw new MaximumRetryException();
            }catch(MaximumRetryException e) {
                System.out.println("Error");
            }
        }

        System.out.println();

        try {
            int c = div(6, 0);
            System.out.println(c);
        }catch(MaximumRetryException e){
            System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
