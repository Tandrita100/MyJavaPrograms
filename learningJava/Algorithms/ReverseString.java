package com.learningJava.Algorithms;

public class ReverseString {
    public static void main(String[] args){
        String s = "Monday";
        char [] arr = s.toCharArray();
        int n = s.length();

        int count = n-1;
        for(int i=0; i<n/2; i++){
            char temp = arr[i];
            arr[i] = arr[count-i];
            arr[count-i] = temp;
        }
        s = new String(arr);
        System.out.println(s);
    }
}

/*
Monday -> yadnoM
012345

for(int i=0; i<n; i++){
            char temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;
        }

        output -> yMonda

for(int i=0; i<n/2; i++){
            char temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;
        }

          output -> ymodan
 */