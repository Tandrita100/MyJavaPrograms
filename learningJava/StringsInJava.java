package com.learningJava;

public class StringsInJava {
    public static void main(String[] args){

        //strings are collections/group of characters
        String a = "Anya";
        String b = new String("Anya");

        System.out.println(a);
        System.out.println(b);
        System.out.println(b + a);
        System.out.println(a==b);  // false because one is stored in string constant pool and another in heap.
        System.out.println(a.equals(b));

        //String concatenation
        System.out.println(a + " Forger");
        System.out.println(a.concat(b));
        System.out.println(a.concat(" forger"));

        //---------------------------------------------------------------------------------------------------------

        System.out.println();

        int a1 = 5;
        int b1 = 5;
        System.out.println(a1==b1);


    }
}
