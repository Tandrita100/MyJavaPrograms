package com.JavaPrograms;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float convert = 0;
        System.out.println("This is a currency converter");

        System.out.println("Enter the Amount in INR:");
        int INR = scan.nextInt();
        float conversion1 = INR * 82.02f;
        System.out.println(conversion1);

        System.out.println("Enter the Amount in USD:");
        int USD = scan.nextInt();
        float conversion2 = USD * 0.012f;
        System.out.println(conversion2);

//        switch(convert){
//
//        }
    }
}
