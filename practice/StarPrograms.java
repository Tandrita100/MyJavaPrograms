package com.practice;

import java.util.Scanner;

public class StarPrograms {
    public static void main(String[] args) {

       // Right triangle
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       for(int i=0;i<a;i++){
           for(int j=0;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }

       // Reverse right triangle
       Scanner scan = new Scanner(System.in);
       int b = scan.nextInt();
       for(int i=a;i>=1;i--){
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println("");
       }

       // 
    }
}
