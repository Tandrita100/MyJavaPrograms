package com.JavaPrograms;
import java.util.Scanner;
public class ConditionalStatements2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = scan.nextInt();
//
//        //else-if statements
//
        if (marks>=90) {
            System.out.println("Your grade is: A");
        }
        else if (marks<90 && marks>=80) {
            System.out.println("Your grade is: B");
        }
        else if (marks<80 && marks>=70) {
            System.out.println("Your grade is: C");
        }
        else if (marks<70 && marks>=60) {
            System.out.println("Your grade is: D");
        }
        else if (marks<60 && marks>=50) {
            System.out.println("Your grade is: E");
        }
        else if (marks<50 && marks>=40) {
            System.out.println("Your grade is: f");
        }
        else {
            System.out.println("You failed :(");
        }

        //switch-case statements

//        Scanner scan1 = new Scanner(System.in);
//        System.out.println("Enter a season:");
//        String var = scan1.next();
//        switch (var){
//            case "summer":
//                System.out.println("its going to be hot");
//                break;
//            case "spring":
//                System.out.println("its going to be flowers everywhere");
//                break;
//            case "rainy":
//                System.out.println("its going to rain");
//                break;
//            case "winter":
//                System.out.println("its going to be so cold everywhere");
//                break;
//            default:
//                System.out.println("enjoy the weather :)");
//
//            }

    }
}
