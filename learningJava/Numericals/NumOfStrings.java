package com.learningJava.Numericals;

public class NumOfStrings {
    public static void main(String [] args){
        int [] arr = new int[26];
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ",");
        }

        System.out.println();

        String n = "TANDRITA";
        for(int i=0; i<n.length(); i++){
            arr[n.charAt(i) - 'A']++;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ",");
        }
    }
}

