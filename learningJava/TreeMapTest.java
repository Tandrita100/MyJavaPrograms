package com.learningJava;

import java.util.*;

public class TreeMapTest {
    public static void main(String[] args){

       // Map<String, Integer> map = new TreeMap<String, Integer>();
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        map.put("D", 87);
        map.put("P", 56);
        map.put("S", 17);
        map.put("F", 7);
        //map.put(null, 7); -> will give NullPointerException
        map.put("Q", null);

        System.out.println(map);

        // for keys
        for(String e : map.keySet()){
            System.out.println(e);
        }

        // for values 
        for(Integer e : map.values()){
            System.out.println(e);
        }
    }
}
