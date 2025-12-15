package com.JavaPrograms;
import java.util.Scanner;

public class PracticeQuestions {
    public static void main(String[] args) {

        //Question1
        int a = 10;
        if (a==11)
            System.out.println("I am 11");
        else
            System.out.println("I am not 11");

        //Question2
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks of Zoology:");
        int marks1 = scan.nextInt();
        System.out.println("Enter the marks of Botany:");
        int marks2 = scan.nextInt();
        System.out.println("Enter the marks of Information Technology:");
        int marks3 = scan.nextInt();

        float avg = (marks1+marks2+marks3)/3.0f;
        System.out.println("Your percentage is " + avg);

        if (avg>=40 && marks1>33 && marks2>33 && marks3>33){
            System.out.println("congratulations!!! you passed your exams XD ");
        }
        else{
            System.out.println("oops! try again next time :(");
        }

        //Question3 //ye program galat h baad me thik krte h isko :(
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter your annual income:");
        float tax = 0;
        float income = scan1.nextFloat();
        if (income>=2.5f){
            //System.out.println("you don't have to pay any tax");
            tax = tax + 0;
        }
        else if (income>2.5f && income<=5.f) {
            tax = (tax + 0.05f) * (income - 2.5f);
        }
        else if (income>5.f && income<=10.0f){
            tax = (tax + 0.05f) * (5.0f- 2.5f);
            tax = (tax + 0.2f) * (income - 5.f);
        }
        else if (income>10.0f){
            tax = (tax + 0.05f) * (5.0f - 2.5f);
            tax = (tax + 0.2f) * (10.0f - 5.f);
            tax = (tax + 0.3f) * (income - 10.0f);
        }
        System.out.println("you have to pay: " + tax);

       //Question4
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int Day = scan2.nextInt();
        switch(Day){
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
        }

        //Question5
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scan3.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        }
        else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        }
        else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }

        //Question6
        Scanner scan4 = new Scanner(System.in);
        String website = scan4.next();

        if(website.endsWith(".org")) {
            System.out.println("Its is an organisational website.");
        }
        else if(website.endsWith(".com")) {
            System.out.println("Its is a commercial website.");
        }
        else if(website.endsWith(".in")) {
            System.out.println("Its is an indian website.");
        }

    }

}
