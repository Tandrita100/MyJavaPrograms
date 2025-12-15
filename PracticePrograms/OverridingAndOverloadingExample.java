package com.PracticePrograms;

class Fruits{
    public void seed(){
        System.out.println("fruits has seeds.");
    }
    //overloading
    public void seed(int i){
        System.out.println("Some fruits do not have seeds.");
    }
    public void health(){
        System.out.println("fruits are good for health.");
    }
    public void taste(){
        System.out.println("fruits tastes sweet");
    }
    //overloading
    public void taste(int b){
        System.out.println("some fruits tastes sour");
    }
}

class Apple extends Fruits{
    //overriding
    public void seed(){
        System.out.println("apple has seeds.");
    }
    //overriding
    public void health(){
        System.out.println("apple are good for health.");
    }
    public void health(int a){
        System.out.println("Rotten apples are not good for health.");
    }
    //overriding
    public void taste(){
        System.out.println("apple tastes sweet");
    }
    //overloading
    public void taste(int b){
        System.out.println("some apples do not taste sweet ");
    }
}
public class OverridingAndOverloadingExample {
    public static void main(String[] args){
        Fruits f = new Fruits();
        f.seed();
        f.seed(3);
        f.health();
        f.taste();
        f.taste(8);
        Apple a = new Apple();
        a.seed();
        a.seed(9);
        a.health();
        a.health(1);
        a.taste();
        a.taste(0);
    }
}
