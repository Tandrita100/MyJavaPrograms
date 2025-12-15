package com.JavaPrograms;

class parent {
    parent(){
        System.out.println("I am a parent.");
    }
    parent(String a){
        System.out.println("I am a parent with a kid named " + a);
    }
}

class child extends parent{
    child(){
        super("vagan");
        System.out.println("I am a kid.");
    }
    child(String a, String b){
        System.out.println("I am a kid and my name is " + a + ",i like " + b  );
    }
}

class pet extends child{
    pet(){
        super("dog", "vagan.");
        System.out.println("I am a pet.");
    }
    pet(String a ,String b, String c){
        System.out.println("I am a pet " + a + ",my boss is " + b + " and i like to " + c);
    }
}

public class InheritanceConstructors {
    public static void main(String[] args) {
    parent baap = new parent();

        System.out.println(" ");

    //child beta = new child();
    child beta = new child("vagan" , "cars.");

        System.out.println(" ");

    pet paltu = new pet ("dog", "vagan", "play.");
    }
}
