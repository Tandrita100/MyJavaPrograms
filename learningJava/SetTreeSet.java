package com.learningJava;

import java.util.*;

public class SetTreeSet {
    public static void main(String[] args){

        //sortedSet -> TreeSet
        SortedSet<Integer> set = new TreeSet<>();
        //TreeSet<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(6);
        set.add(8);
        set.add(4);
        set.add(9);
        set.add(3);
        set.add(8);
        //set.add(null); -> exception will occur

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        for(Integer e: set) {
            System.out.println(e);
        }

    }
}
