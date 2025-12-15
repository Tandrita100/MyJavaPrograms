package com.JavaPrograms;

public class WhileLoops {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        //using while loop
        System.out.println("Using while loop");
        int i = 0;
        while(i<=5){
            System.out.println(i);
            i++;
        }

        /*
        i=1
        1<5
        condition true
        1 will print
        then i=1+1 = 2

         i=2
         2<5
         condition true
         2 will print
         then i=2+1 = 3

         i=3
         3<5
         condition true
         3 will print
         then i=3+1 = 4

         i=4
         4<5
         condition true
         4 will print
         then i=4+1 = 5

         i=5
         5=5
         condition true
         5 will print
         then i=5+1 = 6

         i=6
         6<5
         condition becomes false
         loop will end here
         */

        //infinite while loop
//        while(true){
//            System.out.println("I am Ironman");
//        }

        //Quiz-
//        int k = 100;
//        while(k<=200){
//            System.out.println(k);
//            k++;
//        }

        int j = 0;
        while(j <= 10){
            System.out.println("human");
        }

    }
}
