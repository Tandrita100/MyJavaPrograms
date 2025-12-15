package com.JavaPrograms;

import java.util.Scanner;

public class DiffErrors {
    public static void main(String[] args) {

        //there are 3 types of errors

        //1.Syntax error
        //int a = 3  ---> error : no semicolon
        //b = 4;     ---> error : no datatype

        //2.Logical error
        //A program to print prime no. from 1 to 10.
        System.out.println(1);
        System.out.println(2);
        for(int i=1;i<5;i++){
            System.out.println(2*i+1);  // 1 2 3 5 7 9 --> wrong output 9 is not prime.(logic is wrong in this program)
        }
        //this program will give wrong output because it is not correct but it won't show any error, the program will execute but with wrong output.
        //so the program is logically wrong

        //3.Runtime error (also known as an Exception)
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //if i input a or any other alphabet error will occur because i'm supposed to provide an integer as an input.
        //this will occur a runtime error but the program is correct.

        //To prevent from happening this we handle these exceptions.(known as Exception Handling.)

        //NOTE: Syntax error and Logical errors are faced by the developers and Runtime errors are faced by the users.

    }
}
