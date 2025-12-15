package com.PracticePrograms;

public class StringsExample {
    public static void main(String [] args){
        String s = "TanDRitA bAiDYa";
        String s1 = "TanDRitA bAiDYa1";
        String s2 = "  anDRitA bAiDYa  ";
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.concat(" suki neko") );
        System.out.println(s.substring(4));
        System.out.println(s.substring(5,8));
        System.out.println(s.replace("D","d"));
        System.out.println(s.contains("rita"));
        System.out.println(s.contains("RitA"));
        System.out.println(s.indexOf("n"));
        System.out.println(s.indexOf("i",8));
        System.out.println(s.charAt(7));
        System.out.println(s.startsWith("T"));
        System.out.println(s.endsWith("a"));
        System.out.println(s.equals(s1));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.lastIndexOf("a", 3));
        System.out.println(s.compareTo(s2));
        System.out.println(s2);
        System.out.println(s2.trim());
        System.out.println(s.isEmpty());
        System.out.println(s.equalsIgnoreCase("tandrita baidya"));
        System.out.println(s.replace("RitA", "rita"));

    }
}
