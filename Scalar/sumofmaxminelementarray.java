package com.Scalar;

import java.util.Scanner;

public class sumofmaxminelementarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 4;
        int [] A = new int[N] ;

        System.out.println("enter the elements:");
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }

        int max = A[0];
        for(int i=0;i<N;i++){
            if(A[i]>max)
                max = A[i];
        }
        System.out.println("MAXIMUM:" + max);

        int min = A[0];
        for(int i=0;i<N;i++){
            if(A[i]<min)
                min = A[i];
        }
        System.out.println("MINIMUM:" + min);


        System.out.println("The sum is " + max+min);




    }
}
