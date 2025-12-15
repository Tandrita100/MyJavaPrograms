package com.JavaPrograms;

import java.util.*;

public class arraydeque {
    public static void main(String[] args) {
        //this is the syntax to create an arraydeque.
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();

        //there are some methods we can use in arraydeque.
        //1)add()
        ad1.add(345);
        ad1.add(765);
        ad1.add(455);
        ad1.add(555);
        ad1.add(125);
        System.out.println(ad1);

        ad2.add(3);
        ad2.add(7);
        ad2.add(4);
        ad2.add(5);
        ad2.add(1);
        System.out.println(ad2);

        //2)addAll()
        ad1.addAll(ad2);
        System.out.println(ad1);

        //3)addfirst
        ad1.addFirst(54);
        System.out.println(ad1);

        //4)addlast
        ad2.addLast(755555);
        System.out.println(ad2);

        //5)clone()
        ad2.clone();
        System.out.println(ad2);

        //6)clear()
        ad2.clear();
        System.out.println(ad2);

        //7)getfirst()
        System.out.println(ad1.getFirst());

        //8)getlast()
        System.out.println(ad1.getLast());

        //9)getclass()
        System.out.println(ad1.getClass());

        //10)contains()
        System.out.println(ad1.contains(555));

        //6)remove()
        ad1.remove(125);
        System.out.println(ad1);

        //7)size()
        System.out.println(ad1.size());

        //5)isempty()
        System.out.println(ad2.isEmpty());

        //to learn more about arraydeque go to - https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/ArrayDeque.html

    }
}
