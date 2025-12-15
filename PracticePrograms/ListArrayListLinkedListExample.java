package com.PracticePrograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListArrayListLinkedListExample {
    public static void main(String [] args){

        // dulplicate values allowed
        // null values allowed
        // follows insertion order

        List li = new ArrayList();
        li.add(45);
        li.add("hii");
        li.add(7.9f);
        li.add('o');
        li.add(9675757567.0089786765675645d);
        li.add(true);
        li.add(67586788978l);
        li.add(null);
        li.add(67586788978l);

        //printing simply
        System.out.println(li);

        System.out.println();

        // printing using for loop
        for(int i=0 ; i<li.size(); i++){
            System.out.println(li.get(i));
        }

        System.out.println();

        // arraylist of one type of data
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(null);
        l.add(7);
        l.add(7);
        l.add(null);
        l.add(8);
        l.add(9);
        l.add(10);

        // printing simply
        System.out.println(l);

        System.out.println();

        // printing through iteration using for loop
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        System.out.println();

        // printing through iteration using for-each loop
        for(Integer e : l){
            System.out.println(e);
        }

        List <String> lt = new ArrayList<>();
        lt.add("one");
        lt.add("two");
        lt.add("three");
        lt.add("four");
        lt.add("five");
        lt.add("six");

        System.out.println(lt);
        lt.add(2, "one point 2");
        System.out.println(lt);
        System.out.println(lt.size());
        lt.get(4);
        lt.remove("five");
        System.out.println(lt);
        lt.remove(5);
        System.out.println(lt);
        System.out.println(lt.contains("two"));
        System.out.println(lt.equals(l));
        System.out.println(lt.indexOf("three"));
        System.out.println(lt.isEmpty());
        lt.set(3,"eight");
        System.out.println(lt);
        lt.subList(2,3);
        System.out.println(lt);
        System.out.println(lt.hashCode());
        lt.lastIndexOf("four");
        System.out.println(lt);
        lt.clear();
        System.out.println(lt);
        System.out.println(lt.isEmpty());

        System.out.println();

        // LinkedList
        List <Boolean> list = new LinkedList<>();
        list.add(true);
        list.add(true);
        list.add(false);
        list.add(true);
        list.add(false);
        list.add(null);
        list.add(true);
        list.add(null);
        list.add(true);

        // printing simply
        System.out.println(list);

        System.out.println();

        // printing through iteration using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        // printing through iteration using for-each loop
        for(Boolean e : list){
            System.out.println(e);
        }

    }
}
