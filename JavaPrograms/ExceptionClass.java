package com.JavaPrograms;

import java.util.Scanner;

class myException extends Exception{   //there is a class in java known as Exception class.

    // there are various methods available in java..some of them are
    @Override
    public String toString() {        // this method is used for sout(e)
        return "i am tostring";
    }

    @Override
    public String getMessage() {      // this method is used to print a message
        return "i am getMessage";
    }
}
class maxAgeException extends Exception{

    @Override
    public String toString() {
        return "age cannot be more than 120. ";
    }

    @Override
    public String getMessage() {
        return "age can not be negative.";
    }
}
public class ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        if(a<9){
            try{
                //throw new myException();
                throw new ArithmeticException("hi");
            }catch (Exception e){
                System.out.println(e.toString());        // it will print i am tostring
                System.out.println(e.getMessage());      // it will print i am getmessage
                System.out.println(e);                   // it will also print i am tostring (always resturns tostring)
                e.printStackTrace();                     // it will print the stacktrace message
            }
            System.out.println("khatam");
        }
        System.out.println("end.....");

        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("enter an age:");
        int a1 = scan.nextInt();
        if(a1>120){
            try{
                throw new maxAgeException();
            }catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
            System.out.println("age khatam");
        }
        System.out.println("end.....");
    }
}
