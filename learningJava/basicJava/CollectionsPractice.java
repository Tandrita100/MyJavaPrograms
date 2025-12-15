package com.learningJava.basicJava;

import java.util.*;
//import java.lang.*;

public class CollectionsPractice {
    public static void main(String[] args){

        /*

        //LIST
        //ARRAYLIST
        ArrayList<String> Fruits = new ArrayList<>();
        Fruits.add("Apple");
        Fruits.add("Mango");
        Fruits.add("Litchi");
        Fruits.add("Orange");
        Fruits.add("Grapes");

        System.out.println(Fruits);

        System.out.println();
        for (String e:Fruits) {
            System.out.println(e);
        }

        System.out.println();
        //String f = Fruits.get(3);
        //System.out.println(f);
        System.out.println(Fruits.get(3));

        Fruits.set(1, "Papaya");

        System.out.println();
        System.out.println(Fruits);


        ArrayList<String> Fruits1 = (ArrayList<String>) Fruits.clone();
        System.out.println("cloned arraylist: " + Fruits1);

        Fruits.remove("Grapes");
        System.out.println(Fruits);
        System.out.println(Fruits.size());
        System.out.println(Fruits.contains("Mango"));
        System.out.println(Fruits.isEmpty());
        System.out.println(Fruits.indexOf("Litchi"));
        System.out.println(Fruits.lastIndexOf("Papaya"));
        System.out.println(Fruits.subList(1,3));

        Fruits.clear();
        System.out.println(Fruits);

        System.out.println();

        //LINKEDLIST
        //List <Integer> Num = new LinkedList<>();
        LinkedList <Integer> Num = new LinkedList<>();
        Num.add(1);
        Num.add(15);
        Num.add(21);
        Num.add(71);
        Num.add(19);
        System.out.println(Num);

        System.out.println(Num.size());
        Num.addFirst(7);
        System.out.println(Num);
        Num.addLast(8);
        System.out.println(Num);
        System.out.println(Num.get(4));
        Num.remove(3);
        System.out.println(Num);
        Num.removeFirst();
        System.out.println(Num);
        Num.removeLast();
        System.out.println(Num);
        System.out.println(Num.contains(700));
        System.out.println(Num.indexOf(71));
        System.out.println(Num.lastIndexOf(19));
        System.out.println(Num.isEmpty());
        Num.clear();
        System.out.println(Num.isEmpty());

        System.out.println();

        //SET
        //HASHSET
        HashSet<Character> set = new HashSet<>();
        set.add('k');
        set.add('a');
        set.add('j');
        set.add(null);
        System.out.println(set);

        HashSet<Character> set1 = new HashSet<>();
        set1.add('i');
        set.add(null);
        set1.add('j');
        set1.add('l');
        System.out.println(set1);

        set.addAll(set1);
        System.out.println(set);

        System.out.println("Hashcode : " + set.hashCode());
        System.out.println(set.contains('l'));
        System.out.println(set.size());
        System.out.println(set.remove('a'));
        System.out.println(set);
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set);

        System.out.println();

        //LINKEDHASHSET
        LinkedHashSet <Integer> l = new LinkedHashSet<>();
        l.add(25);
        l.add(5);
        l.add(50);
        l.add(15);
        l.add(95);
        l.add(50);
        l.add(null);
        System.out.println(l);

        System.out.println(l.contains(6));
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        l.remove(95);
        System.out.println(l);
        System.out.println(l.hashCode());
        l.clear();
        System.out.println(l);


        //TREESET
        TreeSet<String> ts = new TreeSet<>();
        //ts.add("red");
        ts.add("yellow");
        //ts.add("blue");
        //ts.add("white");
        // ts.add("red");    --> will throw an error
        ts.add("purple");
        // ts.add(null);     --> will throw an error
        System.out.println(ts);
        ts.remove("white");
        System.out.println(ts);

        System.out.println(ts.contains("red"));
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.size());
        System.out.println(ts.isEmpty());
        System.out.println(ts.lower("red"));
        System.out.println(ts.higher("purple"));

        System.out.println(ts.floor("white"));
        System.out.println(Math.floor(4.06));
        System.out.println(Math.ceil(4.06));
        System.out.println(ts.ceiling("blue"));
        System.out.println(ts);
        System.out.println("Descending order:" + ts.descendingSet());
        System.out.println(ts);
       // System.out.println(ts.subSet("red", "blue"));  ---->   IllegalArgumentException: fromKey > toKey
       // System.out.println("Subsets: " + ts);
        System.out.println(ts.pollFirst());
        System.out.println(ts);
        System.out.println(ts.pollLast());
        System.out.println(ts);

        TreeSet<Integer> ts1 = new TreeSet<>();
        ts1.add(6);
        ts1.add(8);
        ts1.add(2);
        ts1.add(9);
        ts1.add(4);
        System.out.println("Subset : " + ts1.subSet(2,7));
        System.out.println(ts1.headSet(6));
        System.out.println(ts1.tailSet(6));
        System.out.println("Descending Order : " + ts1.descendingSet());


        //MAP
        //HASHMAP
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A",56);
        map.put("B",34);
        map.put("C",74);
        map.put("D",null);
        map.put(null,56);
        map.put(null,null);
        System.out.println(map);
        System.out.println(map.get("C"));
        System.out.println(map.get("d"));
        System.out.println(map.containsKey("E"));
        System.out.println(map.containsValue(45));
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println();

        for(String s : map.keySet()){
            System.out.println(s);
        }

        System.out.println();

        for(Integer s : map.values()){
            System.out.println(s);
        }

        System.out.println();

        for(String s : map.keySet()){
            System.out.println(map.get(s));
        }


         */

        //LINKEDHASHMAP
        LinkedHashMap<String,Integer> lh = new LinkedHashMap<>();
        lh.put("T",78);
        lh.put("A",18);
        lh.put("N",98);
        lh.put("D",54);
        lh.put("R",65);
        lh.put("I",40);
        lh.put("T",36);
        lh.put("A",5);
        System.out.println(lh);

        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("T",78);
        lhm.put("null",18);
        lhm.put("N",98);
        lhm.put("D",null);
        lhm.put("R",65);
        lhm.put("I",40);
        lhm.put("null",null);
        lhm.put("A",5);
        System.out.println(lhm);

        System.out.println(lhm.size());
        System.out.println(lhm.isEmpty());
        System.out.println(lhm.size());
        System.out.println(lhm.get("I"));
        System.out.println(lhm.containsKey("O"));
        System.out.println(lhm.containsValue(89));
        System.out.println(lhm.remove("R"));
        System.out.println(lhm);

        //printing keys using for loop
        for(String e : lhm.keySet()){
            System.out.println(e);
        }

        //printing keys using for loop
        for(Integer e : lhm.values()){
            System.out.println(e);
        }

        //printing both keys and values at the same time
        for(String e : lhm.keySet()){
            System.out.println(lhm.get(e));
        }

        lhm.replace("D", null, 76);
        System.out.println(lhm);


//        lhm.clear();
//        System.out.println(lhm);
//        System.out.println(lhm.isEmpty())

        

    }
}
