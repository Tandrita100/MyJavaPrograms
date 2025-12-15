package com.Scalar;

import java.util.Scanner;

public class sumof2matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows:");
        int rows = sc.nextInt();
        System.out.println("enter the columns:");
        int cols = sc.nextInt();

        int [][] a = new int[rows][cols];
        int [][] b = new int[rows][cols];

        int [][] c = new int[rows][cols];

        System.out.println("enter the values for matrix 1:");
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the values for matrix 1:");
        for(int i=0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("the sum of 2 matrices is:");
        for(int i=0;i<c.length;i++){
            for (int j=0;j<c[i].length;j++){
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }



    }
}
