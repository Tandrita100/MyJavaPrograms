package com.learningJava;

import java.util.*;
public class LinkedHashMapTest {
    public static void main(String[] args){

        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("B", 4);
        map.put("E", 8);
        map.put("A", 9);
        map.put("J", 3);
        map.put("null", 3);
        map.put("null", null);
        map.put("W", null);

        System.out.println(map);

        //for keys
        for(String e : map.keySet()){
            System.out.println(e);
        }

        //for values
        for(Integer e : map.values()){
            System.out.println(e);
        }


    }
}
