package com.JavaPrograms;

import java.util.Scanner;

public class HandlingSpecificExceptions {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 67;
        marks[1] = 84;
        marks[2] = 70;
        System.out.println("Enter an index:");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println("Enter a number to divide with provided number: ");
        int num = sc.nextInt();
        try {
            System.out.println("The value at entered array index is " + marks[index]);
            System.out.println("The value after index/num is " + marks[index] / num);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("An error occurred " + e);
        }
        catch(ArithmeticException e){
            System.out.println("An error occurred " + e);
        }
        catch(Exception e){
            System.out.println("Some error occurred " + e);
        }
        System.out.println("end..");
    }
}
