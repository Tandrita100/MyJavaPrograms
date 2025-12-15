package com.learningJava.Algorithms;

public class BubbleSort {

    public static void main(String[] args){
        int [] a = {12,4,8,16,21,3,10};
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println("Iteration : " + (i+1));
            for(int k=0;k<n;k++){
                System.out.print(a[k]+",");
            }
            System.out.println();
        }
        System.out.println("final sorted result:");
        for(int i=0;i<n;i++){
            System.out.print(a[i] + ",");
        }
    }
}
