package com.PracticePrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAndListIteratorExample {
    public static void main(String [] args){

        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Banana");
        fruits.add("Watermelon");

        System.out.println(fruits);

        System.out.println();

        // iteration using loop
        for(String e : fruits){
            System.out.println(e);
        }

        System.out.println();

        // Iterators
        // we use this to iterate elements in a collections one by one

        Iterator<String> iterator = fruits.iterator();

        System.out.println("using iterator:");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        // removing an element using iterator and remove()
        while(iterator.hasNext()){
            String f = iterator.next();
            if(f.equals("Banana")){
             iterator.remove();
            }
        }

        System.out.println(fruits);

        System.out.println();

        // ListIterator
        // It is only used for iterating lists type. eg- ArrayList an LinkedList.
        // we can traverse in both forward and backward directions
        // it also has different methods

        ListIterator<String> listIterator = fruits.listIterator();

        System.out.println("Using ListIterator in forward direction :");

        // In forward direction
        while(listIterator.hasNext()){
            String f = listIterator.next();
            System.out.println(f);
        }

        System.out.println();

        System.out.println("Using ListIterator in backward direction :");

        // In backward direction
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        System.out.println();

        // modifications in a collection
        listIterator = fruits.listIterator();
        while(listIterator.hasNext()){
            String f = listIterator.next();

            if(f.equals("Apple")){
                listIterator.add("Lemon");
            }
        }

        System.out.println(fruits);

        listIterator = fruits.listIterator();
        while(listIterator.hasNext()){
            String f = listIterator.next();

            if(f.equals("Mango")){
                listIterator.add("Orange");
            }
        }

        System.out.println(fruits);

        listIterator = fruits.listIterator();
        while(listIterator.hasNext()){
            String f = listIterator.next();


            if(f.equals("Watermelon")){
                listIterator.remove();
            }
        }

        System.out.println(fruits);
    }
}
