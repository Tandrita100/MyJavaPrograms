package com.learningJava;

public class Lion {

    int legs;
    int tail;
    int ears;

    //non-arg constructor
    public Lion(){
        legs = 4;
        tail = 1;
        ears = 2;
    }

    //parameterised constructor
    public Lion(int legs, int tail,int ears){
        this.legs = legs;
        this.tail = tail;
        this.ears = ears;
    }

    public static void main(String[] args){

        Lion l = new Lion(); // Default constructor
        System.out.println("Legs of lion : " + l.legs);
        System.out.println("Tail of lion : " + l.tail);

        Lion ll = new Lion(4,1,2);
        System.out.println("Ears of lion : " + ll.ears);

    }
}
