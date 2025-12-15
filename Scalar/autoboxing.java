package com.Scalar;

public class autoboxing {
    public static void main(String[] args) {
        int x = 4;
        float y = 7.7f;
        long z = 600000;

        //wrapper classes
        //autoboxing
        Integer intx = x;
        Float floaty = y;
        Long longz = z;

        System.out.println(intx);
        System.out.println(floaty);
        System.out.println(longz);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.max(6,8));
        System.out.println(Integer.min(6,8));
    }
}
