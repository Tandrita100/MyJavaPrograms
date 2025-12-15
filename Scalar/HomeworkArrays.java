package com.Scalar;

import java.util.Scanner;

public class HomeworkArrays {
    public static void main(String[] args) {

        //1. Given an integer N, generate & print an array containing squares of all numbers from 1 to N.
        int [] num = {1,2,3,4,5};
        int square = 0;
        System.out.println("the square of the array is");
        System.out.print("[");
//        for (int element : num) {
//            square = num[element] * num[element];
//            System.out.print(square + ",");
//        }

        for (int i=0;i<num.length;i++) {
            square = num[i] * num[i];
            System.out.print(square + ",");
        }
        System.out.print("]");


        //2. Read two arrays from the user and generate a third array containing all the common elements from the first two.
        Scanner sc = new Scanner(System.in);
//        int ar1 = 5;
//        int [] arr1 = new int[ar1];
//        for(int i=0;i<ar1;i++){
//            arr1[i] = sc.nextInt();
//        }
        int [] arr1 = {30,43,56,65,4,87};
        int [] arr2 = {65,66,78,4,89,3};
        int commonvalue = 0;
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j< arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    commonvalue++;
                    break;
                }
            }
        }

        int [] arr3 = new int[commonvalue];
        int count = 0;
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j< arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arr3[count++]=arr1[i];
                    break;
                }
            }
        }

        System.out.println(" ");
        System.out.println("common values in both array");
        System.out.print("[");
        for(int k = 0;k<arr3.length;k++){
            System.out.print(arr3[k] + ",");
        }
        System.out.print("]");

        //(now try it by taking input)

        System.out.println();
        //3. Given an array, find the maximum and the minimum elements in it.
        int [] arr = {78,45,3,677,34,8888,54};
        int maxval = Integer.MIN_VALUE;
        int minval = Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(maxval<arr[i]){
                maxval = arr[i];
            }
        }

        for(int i=0;i< arr.length;i++){
            if(minval>arr[i]){
                minval = arr[i];
            }
        }
        System.out.println("maximum value in the array is: " + maxval);
        System.out.println("minimum value in the array is: " + minval);


        //4. Given an array, generate a new array that is reverse of it
        String [] arrr = {"one","two","three","four","five"};
        for(int i=arrr.length-1;i>=0;i--){
            System.out.println(arrr[i]);
        }

    }
}
