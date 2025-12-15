package com.learningJava.basicJava;

public class BabyElephant extends Elephant{
    public static void main(String[] args){
        System.out.println("This is a baby elephant");

        BabyElephant be = new BabyElephant();
        be.walking();

        //cannot access because it is private
        //e.walk();

        //either object creation
        //Elephant e = new Elephant();
        //e.walking();


    }



}
