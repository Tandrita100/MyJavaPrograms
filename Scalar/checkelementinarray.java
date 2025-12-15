package com.Scalar;

import java.util.Scanner;

public class checkelementinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 4;
        int [] A = new int [N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }

        int B = sc.nextInt();

        boolean isPresent = false;
        for (int i = 0; i < N; i++) {
            if (A[i] == B) {
                isPresent = true;
                break;
            }
        }

        // Print the result
        //System.out.println(isPresent ? 1 : 0);
        if(isPresent){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}
