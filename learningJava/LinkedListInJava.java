package com.learningJava;

import java.util.LinkedList;

public class LinkedListInJava {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(54);
        list.add(21);
        list.add(32);
        list.add(87);
        list.add(90);
        list.add(90);
        list.add(null);

        System.out.println(list);
        
        for(Integer e : list){
            System.out.println(e);
        }
    }
}
