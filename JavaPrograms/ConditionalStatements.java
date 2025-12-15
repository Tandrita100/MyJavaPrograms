package com.JavaPrograms;
import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        System.out.println("Enter your age:");

        //here = is an assignment operator
        int age = scan.nextInt();

        //if-else statement

       // >=
        if (age>=18){
            System.out.println("Yay! you an drive.");
        }
        else{
            System.out.println("oops!! not yet :(");
        }

        //here == is a relational operator
        if (age==18) {
            System.out.println("Yay! you an drive.");
        }
        else{
            System.out.println("oops!! not yet :(");
        }

        //!=
        if (age!=18){
            System.out.println("you are not 18 years old");
        }
        else{
            System.out.println("you are 18 years old");
        }

        //using boolean
        boolean cond = (age == 18);
        if(cond){
            System.out.println("Yay! you an drive.");
        }
        else{
            System.out.println("oops!! not yet :(");
        }


        //shorthand if...else
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }

}
