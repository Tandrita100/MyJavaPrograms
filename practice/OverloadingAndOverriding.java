package com.practice;

class tree{

    void branches(){
        System.out.println("the branches are growing");
    }

    // overriding
    void branches(int a){
        System.out.println("the branches are growing with a argument");
    }

    void leaves(){
        System.out.println("the leaves are growing");
    }

}

class mango extends tree{

    void branches(){
        System.out.println("the branches are growing");
    }

    // overriding
    void branches(int a){
        System.out.println("the branches are growing with a argument");
    }

    void leaves(){
        System.out.println("the leaves are growing");
    }
    
}

public class OverloadingAndOverriding {
    public static void main(String[] args){

    }
}
