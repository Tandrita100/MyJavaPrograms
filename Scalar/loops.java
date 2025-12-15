package com.Scalar;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();

        //for loop  (printing numbers from 1 to a)
        for(int i=1;i<=a;i++){
            System.out.println(i);
        }




        //while loops
        System.out.println();

        // (printing numbers from 1 to 10)
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        System.out.println();

        //(count the number of digits)
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scan.nextInt();
        int digits = 0;
        while(num > 0){
            num /= 10;
            digits++;
        }
        System.out.println(digits);

        System.out.println();

        //(printing numbers in reverse order)
        int b = 5;
        while(b>0){
            System.out.println(b);
            b--;
        }

        System.out.println("using do-while");
        //do - while
        //(printing numbers in reverse order)
        int c = 5;
        do{
            System.out.println(c);
            c--;
        }while(c>0);

        System.out.println();
        //(sum of positive numbers from the given stream of numbers(countless numbers ...) we have to find the sum of numbers by readind the num until the num is negative.
        Scanner s = new Scanner(System.in);
        int n ;
        int sum = 0;
        do{
            n = s.nextInt();  //give more than 1 inputs in a single line with a negative input.
            sum += n;
        }while(n>=0);
        System.out.println("the sum is: " + sum);



    }
}
