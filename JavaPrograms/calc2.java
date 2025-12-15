package com.JavaPrograms;
import java.util.Scanner;
public class calc2 {
    public static void main(String[]cal){

        System.out.println("Enter your School subject List here:");
        Scanner mysub = new Scanner(System.in);

        //student_Name
        System.out.println("Enter your name:");
        String name = mysub.nextLine();

        System.out.println("School subject List:");

        //Subject list
        System.out.println("For Hindi");
        int Hindi = mysub.nextInt();
        System.out.println("Your Marks in Hindi:" + Hindi);

        System.out.println("For English");
        int English = mysub.nextInt();
        System.out.println("Your Marks in English: " + English);

        System.out.println("For Math");
        int Math = mysub.nextInt();
        System.out.println("Your marks in Math: " + Math);

        System.out.println("For sst");
        int Punjabi = mysub.nextInt();
        System.out.println("Your marks in sst: " + Punjabi);

        System.out.println("For Computer");
        int Computer = mysub.nextInt();
        System.out.println("Your marks in Computer: " + Computer);
        System.out.println();

        int var = Hindi + English + Math + Punjabi + Computer;

        System.out.print("Hey! " + name + " Your Total marks is: ");
        System.out.println(var);
        float var1 =  var * 100 / 500;
        System.out.print("Your Percentage is: ");
        System.out.println(var1);
    }
}