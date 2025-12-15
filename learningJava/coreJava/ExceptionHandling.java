package com.learningJava.coreJava;

public class ExceptionHandling {
    public static void main(String[] args){
//              int i = 1;
//           int j = i / 0;
//          System.out.println(j);
        try {
            int i = 1;
            int j = i / 0;
            System.out.println(j);   //ArithmeticException: / by zero
        }catch(Exception e){
           // System.out.println("error");
            e.printStackTrace();
            System.out.println("error");
        }
    }
}