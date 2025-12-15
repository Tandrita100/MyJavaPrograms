package com.learningJava;

class parent{
     int hands = 2;
     int legs = 2;
}

class child extends parent{
     int eyes = 2;
     int nose = 1;
}

public class ArraysInheritance {
    public static void main(String [] args){

        int [] array1 = new int[5];
        array1[0] = 67;
        array1[1] = 45;
        array1[2] = 32;
        array1[3] = 98;
        array1[4] = 56;

        //printing the array using for loop
        for(int i=0 ; i<array1.length ; i++){
            System.out.println(array1[i]);
        }

        parent [] parentArray = new parent[3];
        parent p1 = new parent();
        parent p2 = new parent();
        parent p3 = new parent();
        parentArray[0] = p1;
        parentArray[1] = p2;
        parentArray[2] = p3;
        System.out.println(parentArray[0]);
        System.out.println(p1);
        System.out.println(parentArray[1]);
        System.out.println(parentArray[2]);
        
        child [] childArray = new child[3];
        child c1 = new child();
        child c2 = new child();
        child c3 = new child();
        childArray[0] = c1;
        childArray[1] = c2;
        childArray[2] = c3;

        parentArray = childArray;

        System.out.println(parentArray[0]);
        System.out.println(parentArray[0]);
        System.out.println(parentArray[0]);

//        System.out.println(childArray[0]);
//        System.out.println(c1);
//        System.out.println(childArray[1]);
//        System.out.println(childArray[2]);

    }
}
