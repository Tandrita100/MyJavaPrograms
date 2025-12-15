package com.JavaPrograms;

import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        // just like arraylist this is syntax to create linkedlist.
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<String> l2 = new LinkedList<>();
        LinkedList<String> l3 = new LinkedList<>();

        //there are several methods in linked list some of them are-
        //1)add() - Inserts an element at the end of the ArrayList.
        l1.add(76);
        l1.add(45);
        l1.add(29);
        l1.add(79);
        l1.add(55);
        l1.add(38);

        l2.add("ichigo");
        l2.add("denji");
        l2.add("gintoki");
        l2.add("tanjiro");
        l2.add("itadori");
        l2.add("gintoki");

        l3.add("apple");
        l3.add("banana");
        l3.add("cocoa");
        l3.add("dragonfruit");

        //2)add(index,value) - Inserts an element at the given index.
        l1.add(6,65);
        System.out.println(l1);

        //3)remove() - used to remove an element from the linked list
        l1.remove(3);
        System.out.println(l1);

        //4)set() - used to change an already existing element of a linked list.
        l1.set(4,888);
        System.out.println(l1);

        //5)addlast() - used to insert an element at the start of the linked list.
        l1.addLast(566);
        System.out.println(l1);

        //6)addFirst() - used to insert an element at the start of the linked list.
        l1.addFirst(1000);
        System.out.println(l1);

        l2.addFirst("eren");
        System.out.println(l2);

        //using for loop to print the linkedlist
        for(int i=0; i<l2.size(); i++){
            System.out.print(l2.get(i) + ", ");
        }

        System.out.println("\n" + l3);

        //addAll()
        l2.addAll(l3);
        System.out.println(l2);

        //8)contains()
        System.out.println(l2.contains("eren"));

        //9)indexof()
        System.out.println(l2.indexOf("gintoki"));

        //10)lastindexof()
        System.out.println(l2.lastIndexOf("gintoki"));

        //11)clear() - it clears the entire linkedlist.
        l3.clear();
        System.out.println(l3);

        //to learn more about linkedlist go to - https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/LinkedList.html


    }

}
