package com.JavaPrograms;

class Varargs {

    static int add(int ...arr){
        int result = 0;
        for (int a : arr){
            result = result + a;
        }
        return result;
    }

    public static void main(String[] args){
        int b = 6;
        int c = 7;
        int d = 9;
        int e = 3;
        System.out.println(add(1,2));
        System.out.println(add(2,3,4));
        System.out.println(add(4,5,6));
        System.out.println(add(b,c));
        System.out.println(add(b,c,d,e));
    }
}