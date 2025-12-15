package com.learningJava.Algorithms;

public class Sorting {
    public static void main(String[] args){

        char [] a = {'a', 'b', 'c', 'a', 'g', 'h', 'a', 'r', 'i', 'b', 'g', 'h'};
        int [] arr = new int[26];
        char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        //String s = " ";

        for(int i=0;i<a.length;i++){
            int temp = a[i]-'a';
            arr[temp]++;
        }

        for(int i=0;i<26;i++){
           for(int j=0; j<arr[i] ; j++){
              // s = s+alphabets[i];
               System.out.print(alphabets[i]);
           }
        }
       // System.out.println(s);
    }
}
