package com.PracticePrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
    public static void main(String [] args){

        /* IN HASHMAP -
         -stores in key and value pair
         -unique keys and duplicate values
         -null values allowed
         -multiple null values but only 1 null key
         -do not follow insertion order
        */

        Map<String,Integer> mp = new HashMap<>();
        mp.put("A",87);
        mp.put("A",187);
        mp.put("B",87);
        mp.put(null,870);
        mp.put("D",null);
        mp.put("C",null);

        System.out.println(mp);

        System.out.println();

        // for printing keys
        for(String e : mp.keySet()){
            System.out.println(e);
        }

        System.out.println();

        // for printing values
        for(Integer e : mp.values()){
            System.out.println(e);
        }

        System.out.println();

        // another way to print values
        for(String e : mp.keySet()){
            System.out.println(mp.get(e));
        }

        // for printing both keys and values together
        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.println("Key : " + e.getKey() + " value : " + e.getValue());
        }

        System.out.println();

        // LinkedHashMap

        /* IN LinkedHashMap -
         -stores in key and value pair
         -unique keys and duplicate values
         -null values allowed
         -multiple null values but only 1 null key
         -follow insertion order
        */

        Map<Integer,String> mpl = new LinkedHashMap<>();
        mpl.put(1,"apple");
        mpl.put(1,"Mango");
        mpl.put(31,"apple");
        mpl.put(11,null);
        mpl.put(null,"banana");
        mpl.put(null,"fig");
        mpl.put(51,"null");

        System.out.println(mpl);

        System.out.println();

        // printing keys
        for (Integer e : mpl.keySet()){
            System.out.println(e);
        }

        System.out.println();

        // printing values
        for(String e : mpl.values()){
            System.out.println();
        }

        System.out.println();

        // other way
        for(Integer e : mpl.keySet()){
            System.out.println(mpl.get(e));
        }

        System.out.println();

        // printing both keys and values together
        for(Map.Entry<Integer,String> e : mpl.entrySet()){
            System.out.println("Key : " + e.getKey() + " value : " + e.getValue());
        }

        System.out.println();

        // TreeMap

        /* IN TreeMap -
         -stores in key and value pair
         -unique keys and duplicate values
         -null values allowed
         -no null key
         -stores values in ascending order
        */

        Map<String,Float> mt = new TreeMap<>();
        mt.put("dog",40.0f);
        mt.put("dog",5.0f);
        mt.put("cat",85.0f);
        mt.put("Goat",null);
        //mt.put(null,5.0f); -> not allowed throws NullpointerException
        mt.put("donkey",null);
        mt.put("mouse",71.0f);

        System.out.println(mt);

        System.out.println();

        // printing the keys
        for(String e : mt.keySet()){
            System.out.println(e);
        }

        System.out.println();

        // printing the values
        for(Float e : mt.values()){
            System.out.println(e);
        }

        System.out.println();

        // other method to print value
        for(String e : mt.keySet()){
            System.out.println(mt.get(e));
        }

        System.out.println();

        // printing both keys and values together
        for(Map.Entry<String,Float> e : mt.entrySet()){
            System.out.println("Key : " + e.getKey() + " value : " + e.getValue());
        }

    }
}