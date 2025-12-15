package com.JavaPrograms;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

       for(int a = 1;a<=10;a++){
            System.out.println(a);
        }

       /*
        i=1
        1<=10
        condition true
        1 will print
        then i=1+1 = 2

        i=2
        2<=10
        condition true
        2 will print
        then i=2+1 = 3

        i=3
        3<=10
        condition true
        3 will print
        then i=3+1 = 4

        i=4
        4<=10
        condition true
        4 will print
        then i=4+1 = 5

        i=5
        5<=10
        condition true
        5 will print
        then i=5+1 = 6

        i=6
        6<=10
        condition true
        6 will print
        then i=6+1 = 7

        i=7
        7<=10
        condition true
        7 will print
        then i=7+1 = 8

        i=8
        8<=10
        condition true
        8 will print
        then i=8+1 = 9

        i=9
        9<=10
        condition true
        9 will print
        then i=9+1 = 10

        i=10
        10<=10
        condition true
        10 will print
        then i=10+1 = 11

        i=11
        11<=10
        condition becomes false
        loop will end
        */

        for(int b= 1;b<=0;b++){
            System.out.println(b);
        }
        //nothing will print because condition is false


        //Quiz1
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println(2 * i + 1);
           // System.out.println(i);
        }

        /* 2n = even numbers
           2*0 = 0
           2*1 = 2
           2*2 = 4 and so on....
         */

         /* 2n+1 = odd numbers
           2*0 + 1 = 1
           2*1 + 1 = 3
           2*2 + 1 = 5 and so on....
         */

        //this program will generate an infinite loop
//        for(int j=5;j>0;j++){
//            System.out.println(j);
//        }

        //decrementing for loop
        System.out.println("Reverse order-");
        for(int j=5;j>0;j--){  //if i write j>=0 then 0 will also print //we can also write j!=0
            System.out.println(j);
        }

        /*
        j=5
        5>0
        condition true
        5 will print
        5-1= 4

        j=4
        4>0
        condition true
        4 will print
        4-1= 3

        j=3
        3>0
        condition true
        3 will print
        3-1= 2

        j=2
        2>0
        condition true
        2 will print
        2-1= 1

        j=1
        1>0
        condition true
        1 will print
        1-1= 0

        j=0
        0>0
        condition becomes false
        loop will end
         */

        //Quiz2
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n1 = scan.nextInt();
        for(int l=n1;l>0;l--) {
            System.out.println(l);
        }

    }
}
