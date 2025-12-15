package com.Scalar;

public class iteratingARRAY {
    public static void main(String[] args) {
        int [][] a = {{3,4,5,2},
                {3,4,2,-3},
                {6,-8,6,4},
                {3,7,-34,566}
        };

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + ",");
            }
            System.out.println();
        }

    }
}
