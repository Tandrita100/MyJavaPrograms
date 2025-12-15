package com.learningJava.basicJava;

class Elephant {
    int ears;
    int trunk;
    int legs;

    private void walk(){
        System.out.println("The elephant is walking");
    }

    public void walking(){
        walk();
    }

    public static void main(String[] args){
        System.out.println("This is an elephant");

        Elephant e = new Elephant();
        e.walk();

    }
}
