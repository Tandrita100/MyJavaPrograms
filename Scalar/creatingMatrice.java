package com.Scalar;

import java.util.Scanner;

public class creatingMatrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] a = new int[rows][cols];

        //input the elements
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j] = sc.nextInt();
            }
        }

        //output in a form of a matrix
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
