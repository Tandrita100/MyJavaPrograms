package com.JavaPrograms;

//1st way to import a scanner class
//import java.util.Scanner;

//2nd way to import a scanner class
import java.util.*;

public class Packages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //3rd way to import a scanner class
        //java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("enter a no.");
        int n = scan.nextInt();
        System.out.println("woohoo!!!");

    }
}
