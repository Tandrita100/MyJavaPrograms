package com.learningJava.Algorithms;

public class Palindrome {
    public static void main(String[] args){
        String s = "ABCBAE";
        char [] arr = s.toCharArray();
        int n = s.length();

//        for(int i=0; i<n; i++){
//            for(int j=n-1; j>0; j--){
//                if(arr[i]==arr[j]){
//                    System.out.println("String is Palindrome.");
//                }else{
//                    System.out.println("String is not Palindrome.");
//                }
//            }
//        }

        int count=n-1;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[count]){
                System.out.println("not palindrome");
                break;
            }
            count--;
        }
        if(count == -1){
            System.out.println("palindrome");
        }

//

    }
}
