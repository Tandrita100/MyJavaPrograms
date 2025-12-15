package com.practice;

public class PracticeSetArrays {
    public static void main(String[] args) {

        //Problem1
        float [] num = {2.0f,5.0f,3.0f,7.3f,4.7f};
        float sum = 0;
        for(float elements:num){
            sum = sum + elements;
        }
        System.out.println("The sum is " + sum);

        System.out.println();

        //Problem2
        int [] n = {2,5,3,7,4};
        int a = 15;
        boolean isarray = false;
        for(int elements : n){
            if(a==elements){
                isarray = true;
                break;
            }
            }
            if(isarray) {
                System.out.println("Present");
            }
            else{
                System.out.println("Not Present");
        }

        System.out.println();

        //Problem3
        float [] marks = {82.0f,75.0f,63.0f,77.0f,84.0f};
        float sum1 = 0;
        for(float element:marks){
            sum1 = sum1 + element;
        }
        System.out.println("The average marks is " + sum1/marks.length);

        System.out.println();

        //Problem4
        int [][] b = {{1,2,3},
                      {4,5,6}};
        int [][] c = {{2,6,8},
                      {3,5,7}};
        int [][] result = {{0,0,0,},
                           {0,0,0}};

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                //System.out.printf("The values are i=%d and j=%d \n",i,j);
                System.out.printf("i=%d " + "j=%d" + " ",i ,j);
                result[i][j] = b[i][j] + c[i][j];
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print("The result is: " + result[i][j] + " ");
               // System.out.println(result[i][j] + " ");
                result[i][j] = b[i][j] + c[i][j];
            }
            System.out.println("");
        }

        System.out.println();

        //Problem5
        //i don't understand it :(

        //Problem6
        int [] arr = {10,500,42,318,76,100,140};
       // int max = 0;
        int max = Integer.MIN_VALUE;
        for (int element : arr) {
            if(element>max){
                max = element;
            }
        }
        System.out.println("The maximum number in the array is " + max);

        System.out.println();

        //Problem7
        float [] arr1 = {10.9f,500.0f,42.6f,318.76f,6.76f};
        //int min = 0;
        float min = Float.MAX_VALUE;
        for (float element : arr1) {
            if(element<min){
                min = element;
            }
        }
        System.out.println("The minimum number in the array is " + min);

        System.out.println();

        //Problem8
        //int [] arr2 = {10,500,42,318,76,100,140};
        int [] arr2 = {10,50,62,78,100,140};
        boolean sort = true;
        for (int i=0;i<arr2.length-1;i++){
            if(arr2[i]>arr2[i+1]){
                sort = false;
                break;
            }
        }
        if(sort==true){
            System.out.println("The array is sorted.");
        }
        else{
            System.out.println("The array is unsorted.");
        }
}
}
