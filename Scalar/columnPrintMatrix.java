package com.Scalar;

public class columnPrintMatrix {
    public static void main(String[] args) {
        int [][] ar = {
                {10,20,30,40},
                {50,60,70,80},
                {90,100,110,120}};

       int rows = ar.length;
       int cols = ar[0].length;

       for(int i=0;i<cols;i++){
           for(int j=0;j<rows;j++){
               System.out.print(ar[j][i] + " ");
           }
           System.out.println();
       }
    }
}