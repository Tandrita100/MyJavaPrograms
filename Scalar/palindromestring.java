package com.Scalar;

import java.util.Scanner;

public class palindromestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next();

        StringBuilder sb = new StringBuilder(st1);
        sb.reverse();
        System.out.println("REVERSE:" + sb);

        String st2 = sb.toString();

        if(st1.equals(st2)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
