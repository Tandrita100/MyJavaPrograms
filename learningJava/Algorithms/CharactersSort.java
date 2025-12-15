package com.learningJava.Algorithms;

public class CharactersSort {
    public static void main(String[] args){
        char [] a = {'a', 'b', 'c', 'a', 'g', 'h', 'a', 'r', 'i', 'b', 'g', 'h'};
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
            if(a[j]>a[j+1]){
                char temp = a[j+1];
                a[j+1] = a[j];
                a[j] = temp;
            }
            }
        }
        System.out.print("sorted characters : ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]);
        }
    }
}
