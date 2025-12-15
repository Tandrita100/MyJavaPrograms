package com.JavaPrograms;

public class TryCatchExceptionHandling {
    public static void main(String[] args) {

      /*
        int a = 2000;
        int b = 0;
        int c = a/b;  (ArithmeticException)
        System.out.println(c);

        Output-
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at com.tandrita.TryCatchExceptionHandling.main(TryCatchExceptionHandling.java:7)

        if we do it this way this following exception will occur, to solve this problem we need to handle by using try and catch block.
       */

        int a = 2000;
        int b = 0;
        //using Try and catch-
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("we can't divide a number from 0 because " + e);
        }
        System.out.println("end......");
    }
}
