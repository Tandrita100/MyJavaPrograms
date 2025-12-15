package com.JavaPrograms;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {

        //NESTED TRY CATCH
        /*
        int[] marks = new int[3];
        marks[0] = 79;
        marks[1] = 83;
        marks[2] = 55;
        System.out.println("enter an index:");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        try {
            System.out.println("welcome to nested try catch.");
            try {
                System.out.println(marks[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("This index does not exist due to " + e);
                System.out.println("Exception level 2");
            }
        }catch (Exception e) {
            System.out.println("This index exists.");
            System.out.println("Exception level 1 " + e);
        }
        System.out.println("end..");
        */


        //QUICK QUIZ
        int[] marks = new int[3];
        marks[0] = 79;
        marks[1] = 83;
        marks[2] = 55;
        Scanner sc = new Scanner(System.in);
        boolean boo = true;
        while (boo) {
            System.out.println("enter an index:");
            int index = sc.nextInt();
            try {
                System.out.println("welcome to nested try catch.");
                try {
                    System.out.println(marks[index]);
                    boo = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("This index does not exist due to " + e);
                    System.out.println("Exception level 2");
                }
            } catch (Exception e) {
                System.out.println("This index exists.");
                System.out.println("Exception level 1 " + e);
            }
            System.out.println("end..");
        }
    }
}