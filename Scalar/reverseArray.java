package com.Scalar;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index:");
        int n = sc.nextInt();
        int [] ar = new int[n];

        System.out.println("Enter the elements:");
        for(int a=0;a<n;a++){
            ar[a] = sc.nextInt();
        }

        int i=0;
        int j=n-1;

        while(i<j){
           int temp = ar[i];
           ar[i] = ar[j];
           ar[j] = temp;

           i++;
           j--;
        }

        for(int k=0;k<n;k++){
            System.out.print(ar[k] + " ");
        }

    }
}
