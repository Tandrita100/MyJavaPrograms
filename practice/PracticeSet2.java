package com.practice;
import java.util.Scanner;
public class PracticeSet2 {
    public static void main(String[] args) {

        //Problem1
       // float a = 7/4 * 9/2;         // it will print 4.0 which is wrong
        float a = 7/4.f * 9/2.f;         // it will print the correct ans
        System.out.println(a);

        System.out.println();

        //Problem2
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

        System.out.println();

        //Problem3
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int b = scan.nextInt();
        System.out.println(b>10);

        System.out.println();

        //Problem4
        int v = 8;
        int u = 4;
        int a1 = 1;
        int s = 7;
        System.out.println(((v*v)-(u*u))/2*a1*s);

        System.out.println();

        //Problem5
        int x = 7;
        int y = ((7*49)/7) + (35/7);
        System.out.println(y);
        //System.out.println(7*49/7+35/7);

    }
}
