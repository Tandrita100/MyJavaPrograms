package com.Scalar;

import java.util.ArrayList;

public class removeevennumarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(42);
        list.add(37);
        list.add(4);
        list.add(23);
        list.add(91);
        list.add(16);
        list.add(555);

        System.out.println(list);

        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i) % 2 == 0){
                 list.remove(i);
            }
        }

        System.out.println(list);
    }
}
