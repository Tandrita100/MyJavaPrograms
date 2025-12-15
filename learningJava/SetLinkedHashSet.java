package com.learningJava;

import java.util.*;

public class SetLinkedHashSet {
    public static void main(String [] args){

        //LinkedHashSet<String> set = new LinkedHashSet<>();
        Set<String> set = new LinkedHashSet<>();
        set.add("blue");
        set.add("green");
        set.add("red");
        set.add("Yellow");
        set.add("green");
        set.add(null);


        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("blue"));

        for(String e : set){
            System.out.println(e);
        }

        System.out.println("**************************************");

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(8);
        set1.add(4);
        set1.add(2);
        set1.add(5);

        for(Integer e : set1){
            System.out.println(e);
        }

    }
}
