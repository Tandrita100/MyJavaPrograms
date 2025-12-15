package com.practice;
import java.util.Scanner;

public class PracticeSet4 {
    public static void main(String[] args) {

        //Problem1  correct this program.
        int a = 10;
        if (a==11)
            System.out.println("I am 11");
        else {
            System.out.println("I am not 11");
        }

        System.out.println();

        //Problem2
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks of English: ");
        int d = scan.nextInt();
        System.out.println("Enter the marks of Maths: ");
        int e = scan.nextInt();
        System.out.println("Enter the marks of Computer: ");
        int f = scan.nextInt();
        float avg = (d+e+f)/3.0f;
        System.out.println("Your Average marks is " + avg + ".");
        if (avg>=40 && d>=33 && e>=33 && f>=33)
            System.out.println("Congratulations You Passed :)");
        else {
            System.out.println("Try Again :(");
        }

        System.out.println();

        //Problem3
        //i cant solve this one TwT heavy maths

        //Problems4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        System.out.println();

        //Problem5
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Year:");
        int year = s.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("It is a Leap Year.");
        }
        else {
            System.out.println("Not a Leap Year.");
        }

        System.out.println();

        //Problem6
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter a Website:");
        String web = sca.nextLine();
        if(web.endsWith(".com")){
            System.out.println("This is a Commercial Website.");
        }
        else if (web.endsWith(".org")) {
            System.out.println("This is an Organizational Website.");
        }
        else if(web.endsWith(".in")){
            System.out.println("This is an Indian Website.");
        }

    }
}
