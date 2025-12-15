package com.Scalar;

import java.util.Scanner;

public class maxelementofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index:");
        int n = sc.nextInt();
        int [] ar = new int[n];

        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
           if(ar[i]>max){
               max = ar[i];
           }
        }
        System.out.println(max);
    }
}
