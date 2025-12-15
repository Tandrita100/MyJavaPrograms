package com.learningJava;

class Apple{
    public void taste(){
        System.out.println("It tastes sweet.");
    }
}

public class fruitPolymorphism extends Apple{
    public static void main(String[] args){

        Apple a = new Apple();
        Apple fp = new fruitPolymorphism();

        a.taste();
        fp.taste();
        //a.color(); //not possible
        //fp.color(); // not possible

        System.out.println();
        
        fruitPolymorphism f = new fruitPolymorphism();
        f.taste();
        f.color();
    }

    public void taste(){
        System.out.println("It tastes sour.");
    }

    public void color(){
        System.out.println("It is red in color.");
    }

}
