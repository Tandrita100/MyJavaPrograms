package com.learningJava;

public class ArraysInJava {
    public static void main(String[] args){

        //array 1 of int type
        int [] arr1 = new int [5];
        arr1 [0] = 34;
        arr1 [1] = 35;
        arr1 [2] = 36;
        arr1 [3] = 37;
        arr1 [4] = 38;

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);

        System.out.println();

        for (int element: arr1) {
            System.out.println(element);
        }

        System.out.println();

        //array 2 of float type
        float [] arr2 ;
        arr2 = new float[3];
        arr2[0] = 78.0f;
        arr2[1] = 43.04f;
        arr2[2] = 568.36f;

        for (float element: arr2) {
            System.out.println(element);
        }

        System.out.println();

        //array 3 of string type
        String [] arr3 = {"one","two","three","four"};

        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println(arr3[3]);
        
    }
}
