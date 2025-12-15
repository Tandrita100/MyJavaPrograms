package com.PracticePrograms;

import java.util.*;

public class SetsExample {
    public static void main(String [] args){

        /* IN HASHSET -
         -no duplicate items -> unique values
         -null values allowed
         -uses hashcode to store values
         -do not follow insertion order
        */

        Set<Integer> s = new HashSet<>();
        s.add(8);
        s.add(8); //  -> duplicate data
        s.add(88);
        s.add(null);
        s.add(7);
        s.add(3);
        s.add(31);
        s.add(13);

        System.out.println(s);

        System.out.println();

        // iterating using loop
        for(Integer e : s){
            System.out.println(e);
        }

        System.out.println();

        System.out.println(s.size());
        System.out.println(s.isEmpty());
        s.remove(88);
        System.out.println(s);
        s.clear();
        System.out.println(s);

        System.out.println();

        // LinkedHashSet

        /*  In LinkedHashSet -
         -no duplicate items -> unique values
         -null values allowed
         -uses hashcode to store values
         -follow insertion order
        */

        Set <String> st = new LinkedHashSet<>();
        st.add("Tulip");
        st.add("Rose");
        st.add("Sunflower");
        st.add("Sunflower");
        st.add(null);
        st.add("Carnation");
        st.add("Gladiolus");
        st.add("calendula");
        st.add("chrysanthemum");
        st.add("Hydrangea");

        System.out.println(st);

        System.out.println();

        //iterating using loop

        List<String> l = new ArrayList<>(st);
        for(int i=0; i<st.size(); i++){
            System.out.println(l.get(i));
        }

        System.out.println();

        // using for-each
        for(String e : st){
            System.out.println(e);
        }

        System.out.println();

        // TreeSet

        /*  In TreeSet -
         -ordered manner
         -no duplicate items -> unique values
         -no null values allowed
         -uses no hashcode to store values uses treemap
         -follow insertion order in ascending order
        */

        Set<Double> sd = new TreeSet<>();
        sd.add(7.8);
        sd.add(7.8);
        sd.add(7.18);
        sd.add(7.81);
        sd.add(71.8);
        //sd.add(null);  -> nullPointer Exception
        sd.add(17.8);

        System.out.println(sd);

        System.out.println();

        //iterating using loop

        List<Double> li = new ArrayList<>(sd);
        for(int i=0; i<sd.size(); i++){
            System.out.println(li.get(i));
        }

        System.out.println();

        //using for-each
        for(Double e : sd){
            System.out.println(e);
        }
    }
}
