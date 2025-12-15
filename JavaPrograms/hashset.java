package com.JavaPrograms;

import java.util.*;

public class hashset {
    public static void main(String[] args) {
        //this is the syntax to create a Hashset.
        HashSet<Integer> h1 = new HashSet<>(6, 0.9f);
        HashSet<Integer> h2 = new HashSet<>(8, 0.4f);

        //there are several methods we can use with Hashset, some of them are -
        //1)add()
        h1.add(45);
        h1.add(12);
        h1.add(35);
        h1.add(23);
        h1.add(55);
        h1.add(64);
        h1.add(75);
        System.out.println(h1);

        h2.add(4500);
        h2.add(1200);
        h2.add(3500);
        h2.add(2300);
        h2.add(5500);
        h2.add(6400);
        h2.add(7500);
        System.out.println(h2);

        //2)clone()
        System.out.println(h1.clone());

        //3)contains()
        System.out.println(h1.contains(55));

        //4)clear()
        h2.clear();
        System.out.println(h2);

        //5)isempty()
        System.out.println(h2.isEmpty());

        //6)remove()
        h1.remove(35);
        System.out.println(h1);

        //7)size()
        System.out.println(h1.size());

    }
}
