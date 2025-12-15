package com.PracticePrograms;

public class ArrayExample {
    public static void main(String [] args){

        // method 1
        int [] arr;
        arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        // arr[5] = 6;

        System.out.println("printing each element one by one:");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        System.out.println();

        // using for loop
        System.out.println("using for loop.");
        int s = arr.length-1;
        for(int i=0; i<arr[s]; i++){
            System.out.println(arr[i]);
        }

        System.out.println();

        // using for-each loop
        System.out.println("using for-each loop:");
        for(int e : arr){
            System.out.println(e);
        }

        System.out.println();

        // method 2
        float [] arr1 = new float[5];
        arr1[0] = 1.0f;
        arr1[1] = 2.0f;
        arr1[2] = 3.0f;
        arr1[3] = 4.0f;
        arr1[4] = 5.0f;

        System.out.println();

        System.out.println("printing each element one by one:");
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);

        // using for loop
        System.out.println("using for loop:");
        for(int i=0; i<arr1.length-1; i++){
            System.out.println(arr1[i]);
        }

        System.out.println();

        // using for-each loop
        System.out.println("using for-each loop:");
        for(float e : arr1){
            System.out.println(e);
        }

        System.out.println();

        // method 3
        String [] colors = {"red","yellow","blue","orange","purple"};
        System.out.println("printing each element one by one:");
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        System.out.println();

        // using for loop
        System.out.println("using for loop:");
        for(int i=0; i<colors.length-1; i++){
            System.out.println(colors[i]);
        }

        System.out.println();

        // using for-each loop
        System.out.println("using for-each loop:");
        for(String e : colors){
            System.out.println(e);
        }

    }
}
