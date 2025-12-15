package com.learningJava;

public class StringBufferTest {
    public static void main(String[] args){
        System.out.println("-------------String Buffer-------------");
        StringBuffer sb = new StringBuffer("Peter");
        System.out.println(sb);
        sb.append(" Parker");
        System.out.println(sb);
    }
}
