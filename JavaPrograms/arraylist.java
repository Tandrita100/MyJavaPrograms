package com.JavaPrograms;

import java.util.*;
import java.util.Collections;   //to use sort method

public class arraylist {
    public static void main(String[] args) {
        //syntax to make an arraylist
        ArrayList<String> l1 = new ArrayList<>();  //arraylist1 to store string values.
        ArrayList<Integer> l2 = new ArrayList<>(); //arraylist2 to store integers.
        ArrayList<Integer> l3 = new ArrayList<>(7); //arraylist2 to store integers.

        //there are several methods we can use in aaraylist. some of them are -
        //1)add - to add items in the arraylist.
        l1.add("luffy");
        l1.add("zoro");
        l1.add("Ace");
        l1.add("Nami");
        l1.add("Sanji");
        l1.add("usopp");
        l1.add(6,"onepiece");  //we can add an item on specific index.
        System.out.println(l1);             //we can print the entire arraylist this way.(horizontal manner)

        l2.add(91);
        l2.add(16);
        l2.add(21);
        l2.add(100);
        l2.add(56);
        l2.add(79);

        l3.add(9110);
        l3.add(160);
        l3.add(7900);
        l3.add(1000);
        l3.add(5600);
        l3.add(7900);
       // l1.addAll(l2); --> this will cause an error because we cant add integer and string together.

        //we can also use a for loop to print the arraylist items.(in the form of queue or in horizontal line.
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+ ", "); //To access an element in the ArrayList, use the get() with index number.
           // System.out.println(", ");
        }

        //we can also use for each loop.
        /*
        for (String i : l1) {
            System.out.println(i);
        }
         */

        //2)get()-//To access an element in the ArrayList, use the get() with index number.
        System.out.println("\n" + l1.get(3));

        //3)remove() - used to delete or remove an element at a given index from the ArrayList.
        l2.remove(3);
        System.out.println(l2);

        //4)contains() - used to check if an ArrayList contains a specified element or not. This method returns the boolean value.
        System.out.println(l2.contains(78));

        //5)addAll() - The elements of an ArrayList can be merged into another Arraylist.
        l2.addAll(l3);
        System.out.println(l2);

        l2.addAll(0,l3);
        System.out.println(l2);

        //6)Indexof() - prints the index of the first occurrence of a particular number. Returns -1 if the element is not present in the ArrayList.
        System.out.println(l1.indexOf("Ace"));

        //7)lastIndexOf() - we can also find the index of the last occurrence of an element.
        System.out.println(l3.lastIndexOf(7900));

        //8)set() - To modify an element with the index number.
        l2.set(4,8030);
        System.out.println(l2);

        //9)clear() - To remove all the elements in the ArrayList.
        l3.clear();
        System.out.println(l3);

        //10)size() - to find the size of an arraylist.
        System.out.println(l2.size());

        //11)sort() - to sort an arraylist alphabetically or numerically.
        Collections.sort(l1);
        System.out.println(l1);

        Collections.sort(l2);
        System.out.println(l2);

        //12)clone() - used to return a shallow copy of an ArrayList.
        l1.clone();
        System.out.println(l1);

        //13)isEmpty() - Returns true if this list contains no elements.
        System.out.println(l3.isEmpty());

        //for more information about arraylist go to-
        //https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/ArrayList.html

    }
}
