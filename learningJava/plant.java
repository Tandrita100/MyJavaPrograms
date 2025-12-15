package com.learningJava;

public class plant {
    int leaves = 40;   //global variable
    int branches;
    int flowers;
    static plant p1;

    public static void main(String[] args){
        plant p = new plant();
        p.bloom();
        int leaves1 = p.leaves;
        System.out.println(leaves1);
        int leaves = 30; //local variable
        System.out.println("No of leaves: " + leaves);
        int branches = 3;  //local variable
        System.out.println("No of branches: " + branches);
        int flowers = 10;  //local variable
        System.out.println("No of flowers: " + flowers);

        System.out.println();

        //for static method
        p1 = new plant();
        p1.leaves = 50;
        p1.branches = 5;
        p1.flowers = 15;
        bloom(p1);

    }

    //non-static method
    public void bloom(){
        System.out.println("Flowers are blooming");
    }

    //static method
    public static void bloom(plant p1){
        System.out.println("Flowers are blooming " + ", no of leaves : " + p1.leaves);
        System.out.println("Flowers are blooming " + ", no of branches : " + p1.branches);
        System.out.println("Flowers are blooming " + ", no of flowers : " + p1.flowers);
    }
}
