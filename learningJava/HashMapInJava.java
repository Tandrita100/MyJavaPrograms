package com.learningJava;

import java.util.*;

public class HashMapInJava {
    public static void main(String[] args){

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Apple", 4);
        map.put("cat", 7);
        map.put("Banana", 9);
        map.put("egg", 4);
        map.put("Dog", 2);
        //map.put("null", 2);
        map.put("null", null);
        map.put("Pen", null);

        System.out.println(map);

        System.out.println();

        // for keys
        for(String e :map.keySet()){
            System.out.println(e);
        }

        System.out.println();

        // for values
        for(String e :map.keySet()){
            System.out.println(map.get(e));
        }

        System.out.println();

        for(Integer e : map.values()){
            System.out.println(e);
        }

    }
}
