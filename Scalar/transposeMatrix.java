package com.Scalar;

public class transposeMatrix {
    static int[][] trannspose(int[][]a){
        int rows = a.length;
        int cols = a[0].length;

        int [][] result = new int[cols][rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result[j][i] = a[i][j];   //first j i and then i j
            }
        }
        return result;
    }

    static void printMatrix(int [][] matrix){
        for (int [] row:matrix) {
            for (int element:row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int [][] arr1 = {{1,12,3},{14,5,16},{7,18,9}};
        int [][] arr2 = {{11,2,13},{4,15,6},{17,8,19}};

        System.out.println("Matrix 1:");
        printMatrix(arr1);

        int [][] result1 = trannspose(arr1);
        System.out.println("Transposed Matrix:");
        printMatrix(result1);

        System.out.println();

        System.out.println("Matrix 2:");
        printMatrix(arr2);

        int [][] result2 = trannspose(arr2);
        System.out.println("Transposed Matrix:");
        printMatrix(result2);


    }
}
