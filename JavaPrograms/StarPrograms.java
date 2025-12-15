package com.JavaPrograms;

public class StarPrograms {
    public static void main(String[] args) {

        for(int i=1;i<=4;i++){  //here we are using nested for loop meaning for loop inside a for loop.
            for(int j=1;j<=i;j++){
                System.out.print("*"); // if we write println here the stars will print in new line.
            }
            System.out.println();
        }


        //In reverse order
        System.out.println("In Reverse Order");
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }


        //compiling both programs
        System.out.println("compiling both");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
