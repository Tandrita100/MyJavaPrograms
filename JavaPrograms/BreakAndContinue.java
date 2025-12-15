package com.JavaPrograms;

public class BreakAndContinue {
    public static void main(String[] args) {

        //break statement using for loop
//        for(int i=0;i<10;i++){
//            System.out.println(i);
//            System.out.println("Avengers Assemble!!!");
//            if(i==6){
//                System.out.println("I am Ironman");
//                break;
//            }
//        }

        //using while loop
//        int i = 0;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("Avengers Assemble");
//            if(i==3){
//                System.out.println("I can do this all day.");
//                break;
//            }
//            i++;
//        }
//        System.out.println("end of the loop..");


//        //using do while
//        int i = 0;
//        do{
//            System.out.println(i);
//            System.out.println("Avengers Assemble");
//            if(i==3){
//                System.out.println("I can do this all day.");
//                break;
//            }
//            i++;
//        }while(i<5);
//        System.out.println("end of the loop..");

        //continue statement
        for(int i=0;i<10;i++){
        if(i == 4){
            System.out.println("good night..bye.");
            continue;
        }
            System.out.println("Good morning");
            System.out.println("hello....");
        }
    }
}
