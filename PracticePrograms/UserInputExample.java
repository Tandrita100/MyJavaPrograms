package com.PracticePrograms;

import java.util.Scanner;

public class UserInputExample {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.next();
        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println("What is your weight?");
        float weight = sc.nextFloat();

        System.out.println("My name is : " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("My weight is : " + weight + " kg" );
    }
}
