package com.learningJava;

import java.util.*;
public class HashSetTet {
    public static void main(String[] args){
        Set<Integer> s = new HashSet<>();
        s.add(2);
        s.add(6);
        s.add(21);
        s.add(8);
        s.add(100);
        s.add(2);
        s.add(8);
        s.add(20);
        s.add(18);
        s.add(null);
        s.add(null);

        System.out.println(s);
        for (Integer i : s) {
            System.out.println(i);
        }

    }
}
