package com.Scalar;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add
        list.add(4);
        list.add(40);
        list.add(14);
        list.add(42);
        list.add(54);

        //print
        System.out.println(list);

        //isempty
        System.out.println(list.isEmpty());

        //clone
        list.clone();

        //clear
        list.clear();

        //remove
        //list.remove(1);

        //System.out.println(list.isEmpty());

        //set
        list.set(2,67);

        //add
        list.add(0,2);
        System.out.println(list);

        //get
        System.out.println(list.get(0));

        //length
        System.out.println(list.size());

    }
}
