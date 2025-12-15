package com.PracticePrograms;

public class ExceptionalHandleExample {
    public static void main(String [] args){

        /* it will give an exception
        int i = 5;
        int j = 5/0;
        System.out.println(j);
         */

        try{
            int i = 5;
            int j = 5/0;
            System.out.println(j);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("invalid");
        }
    }
}
