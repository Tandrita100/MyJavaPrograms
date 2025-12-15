package com.learningJava;

public class BubbleSorting {
    public static void main(String[] args){
        int [] arr = new int [] {234,56,43,789,67,5,13,200};
        for(int i=0 ; i< arr.length; i++){
            for(int j=i+1 ; j<arr.length; j++){
                if(arr[i]>arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            for(int e : arr){
                System.out.print(e+ ",");
            }
            System.out.println();
        }

    }
}

/*

234,56,43,789,67,5,13,200
56,234,43,789,67,5,13,200
56,43,234,789,67,5,13,200
56,43,789,234,67,5,13,200
56,43,789,67,234,5,13,200
56,43,789,67,5,234,13,200
56,43,789,67,5,13,234,200
56,43,789,67,5,13,200,234

56,43,789,67,5,13,200,234
43,56,789,67,5,13,200,234
43,
 */