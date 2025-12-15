package com.Scalar;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int [] marks = {70,89,76,95,68,76,47,56,78,75};
        float average = 0;
        int sum = 0;
        for(int element:marks) {
              sum += element;
        }
        average = (sum) / marks.length;
        System.out.println("Average: " + average);


        String [] names = {"ben","gwen","max","kevin"};
        for(String element:names) {
            System.out.print(element + " ");
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] rollno = new int[n];

        //using for loop
        for(int i=0;i< rollno.length;i++){
            rollno[i] = sc.nextInt();
        }

        for(int i=0;i< rollno.length;i++){
            System.out.println(rollno[i]);
        }

//        //using for-each loop
//        for (int element:rollno) {
//            rollno[element] = sc.nextInt();
//        }
//        for (int element:rollno) {
//            System.out.println(rollno[element]);
//        }


//        System.out.println(rollno[3]);
//        System.out.println(rollno[5]);

    }
}
