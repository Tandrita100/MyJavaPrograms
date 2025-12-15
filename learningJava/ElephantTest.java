package com.learningJava;

 class ElephantTest{

     /* There is nothing like global variable in java Only instance variable and local variables exist in java */

     int legs = 4;
     int trunk;
     int ears;
     int tusk;
     static ElephantTest et1;

     public static void main(String[] args){
         et1 = new ElephantTest();
         et1.legs = 5;
         roar(et1);
         System.out.println("et1 legs:: " + et1.legs);
     }

     //method
     public static void roar(ElephantTest et1){
         int a = 3; //local variable
         et1.legs = 8;
         ElephantTest et = new ElephantTest();

         System.out.println("Et legs :: " + et.legs +" & et1 legs:: " + et1.legs);
     }

     public void roar1(){
         System.out.println("Elephant is roaring");
     }

     //Constructor
     ElephantTest(){

     }
 }

