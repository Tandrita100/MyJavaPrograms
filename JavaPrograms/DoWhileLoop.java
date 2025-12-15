package com.JavaPrograms;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        //while loop
        System.out.println("Using while loop-");
        int a = 0;
        while(a<5){
            System.out.println(a);
            a++;
        }
        //here the output will be n-1 means 0 to 5-1 i.e. 4

        //while loop checks the condition first and then executes the code.

        //Do While loop
        System.out.println("Using do while loop-");
        int b = 0;
        do{
            System.out.println(b);
            b++;
        }
        while(b<5);

        // do while loop executes the code first and then checks the condition.

        //Quiz
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        do{
            System.out.println(n);
            n++;
        }
        while(n<=50);

    }
}
