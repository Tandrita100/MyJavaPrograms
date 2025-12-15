package com.learningJava.Numericals;

public class FindUniqueNum {
    public static void main(String[] args){
        int [] arr = {2,4,1,3,6,2,4,1,9,3,9};

        int c = 0;
        for(int i=0; i<arr.length; i++){
            c = c^arr[i];
            System.out.print(c + ",");
        }
        System.out.println("unique number : " + c);
    }
}
