package com.PracticePrograms;

class Flowers{
    int a;
    String name;

    Flowers(){
        System.out.println("empty constructor of flower");
    }

    Flowers(int a){
        this.a = a;
        System.out.println("constructor with 1 argument of flower");
        System.out.println(a);
    }

    Flowers(int a, String name){
        this.a = a;
        this.name = name;
        System.out.println("constructor with 2 arguments of flower");
        System.out.println(a + " " + name);
    }
}

class Lily extends Flowers{
    int b;
    String name;

    Lily(){
        System.out.println("empty constructor of lily");
    }

    Lily(int a, int b){
        super(a);
        System.out.println("constructor with 1 argument of lily");
        this.b = b;
        System.out.println(a + " " + b);
    }

    Lily(int b,String name){
        this.b = b;
        System.out.println("constructor with 2 arguments of lily");
        this.name = name;
        System.out.println(b + " " + name);
    }

}
public class ConstructorsExample {
    public static void main(String[] args) {
        Flowers f = new Flowers();
        Flowers f1 = new Flowers(7);
        Flowers f2 = new Flowers(4,"tulip");
        Lily l = new Lily();
        Lily l1 = new Lily(9,0);
        Lily l2 = new Lily(2,"Rain lily");
    }
}
