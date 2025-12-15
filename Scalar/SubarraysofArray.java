package com.Scalar;

import java.util.Scanner;

public class SubarraysofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index:");
        int n = sc.nextInt();
        int [] ar = new int[n];

        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }

        for(int si=0;si<n;si++){
            for(int ei=si;ei<n;ei++){
                for(int k=si;k<=ei;k++){
                    System.out.print(ar[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
