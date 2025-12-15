package com.Scalar;

import java.util.ArrayList;

public class removeprimearraylist {
    static boolean isprime(int num){
        if(num<=1){
            return false;
        }
        for(int i =2;i<=Math.sqrt(num);i++){
            if(num % i ==0){
                return true;
            }
        }
        return false;
    }

    static void removeprime(ArrayList<Integer>list){
        for(int i=list.size()-1;i>=0;i--){
            int num = list.get(i);
            if(isprime(num)){
                list.remove(i);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(37);
        list.add(4);
        list.add(23);
        list.add(91);
        list.add(16);
        list.add(5);

        System.out.println(list);

        removeprime(list);

        System.out.println(list);

    }
}
