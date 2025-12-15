package com.learningJava;

import java.util.*;

public class ArrayListInJava {
    public static void main(String[] args){

        List l = new ArrayList();
        l.add(1);
        l.add("hi");
        l.add(3);
        l.add("good morning");
        l.add("sunday");
        l.add(344);

        System.out.println(l);

        System.out.println("****************************************************");

        for(int i=0; i<l.size(); i++){
            System.out.println(l.get(i));
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        ArrayList<String> as = new ArrayList<>();
        as.add("one");
        as.add("two");
        as.add("three");
        as.add("four");
        as.add("five");
        as.add("six");
        as.add("six");
        as.add(null);

        System.out.println(as);

        System.out.println("-----------------------------------------------------");

        for(int i=0; i<as.size(); i++){
            System.out.println(as.get(i));
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        for (String e: as) {
            System.out.println(e);
        }

        as.add(1,"eight");
        System.out.println(as);
        System.out.println(as.size());
        as.remove(1);
        System.out.println(as);
        System.out.println(as.isEmpty());
        System.out.println(as.hashCode());
        System.out.println(as.iterator());
        System.out.println(as.listIterator());
        System.out.println(as.clone());




    }
}
