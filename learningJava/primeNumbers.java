package com.learningJava;

import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();

        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(a); i++){
            if(a % i == 0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("Prime number");
        }else{
            System.out.println("Not Prime number");
        }

    }
}
