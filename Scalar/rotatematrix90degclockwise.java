package com.Scalar;

public class rotatematrix90degclockwise {
    public static void main(String[] args) {
        int[][] ar = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        //swapping
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar[i].length; j++) {
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }
        }


        for (int i = 0; i < ar.length; i++) {
            int k = 0;
            int l = ar[i].length - 1;

            while (k < l) {
                int temp = ar[i][k];
                ar[i][k] = ar[i][l];
                ar[i][l] = temp;

                k++;
                l--;
            }
        }

        for(int i=0;i<ar.length;i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + ",");
            }
            System.out.println();
        }

    }
}

