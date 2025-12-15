package com.practice;

import java.util.Scanner;

public class LargestOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int a = sc.nextInt();
        int maxVal = Integer.MIN_VALUE;
        for(int i=1;i<=a;i++){
            System.out.println("Enter value " + i + ": ");
            int current = sc.nextInt();
            maxVal = Math.max(maxVal,current);
        }
        System.out.println("The maximum value is:" + maxVal);
    }
}
