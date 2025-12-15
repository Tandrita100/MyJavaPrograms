package com.Scalar;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
       // int [] numbers = {45,65,3,87,766,90};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of values you want to input:");
        int n = sc.nextInt();

        int [] numbers = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter a value:");
        int v = sc.nextInt();
        int index = -1;

//        for (int i=0;i<numbers.length;i++) {
//            if(numbers[i]==v){
//                index = i;
//                break;
//            }
//        }

        //iterates right to left
        for (int i=n-1;i>=0;i--) {
            if(numbers[i]==v){
                index = i;
                break;
            }
        }


        System.out.println(index);


//        for (int element:numbers) {
//            if (element == v) {
//                index = element;
//                break;
//            }
//        }
//        System.out.println(index);
    }
}
