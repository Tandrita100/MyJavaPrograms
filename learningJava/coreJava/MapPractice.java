package com.learningJava.coreJava;

import java.util.*;

public class MapPractice {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("A" , 1);
        map.put("V" , 67);
        map.put("E" , 18);
        map.put("U" , 21);

        for(String a : map.keySet()){
            System.out.println(a);
        }

        for(Integer e : map.values()){
            System.out.println(e);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("keys: " + entry.getKey() + " values: " + entry.getValue());
        }

        System.out.println(map.entrySet());

        

    }
}
