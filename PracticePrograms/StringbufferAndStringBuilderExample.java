package com.PracticePrograms;

public class StringbufferAndStringBuilderExample {
    public static void main(String [] args){
        StringBuffer sb = new StringBuffer("Tandrita");
        System.out.println(sb);
        sb.append("baidya");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.replace(1, 2,"hehe");
        System.out.println(sb);
        sb.insert(4,"hiii");
        System.out.println(sb);
        sb.delete(6,7);
        System.out.println(sb);
        System.out.println(sb.length());
        sb.deleteCharAt(6);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.setCharAt(3,'u');
        System.out.println(sb);
        sb.substring(3,8);
        System.out.println(sb);
        sb.trimToSize();
        System.out.println(sb);

        System.out.println();

        StringBuilder sbd = new StringBuilder("Ishaddhas");
        sbd.append("Baidya");
        System.out.println(sbd);

    }
}
