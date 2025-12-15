package com.learningJava;

public class StringBuilderTest {
    public static void main(String[] args){
        System.out.println("-------------String Builder-------------");
        StringBuffer sb = new StringBuffer("Peter");
        System.out.println(sb);
        sb.append(" Parker");
        System.out.println(sb);
    }
}
