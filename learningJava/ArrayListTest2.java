package com.learningJava;

import java.util.*;

public class ArrayListTest2 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(12);
        list.add(200);
        list.add(64);
        list.add(87);
        list.add(934);

        System.out.println(list + "\n");

        for(Integer e : list){
            System.out.println(e);
        }
    }
}
