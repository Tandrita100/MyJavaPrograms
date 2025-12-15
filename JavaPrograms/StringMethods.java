package com.JavaPrograms;

public class StringMethods {
    public static void main(String[] args) {
        String name = "TaNdrIta";
        System.out.println(name);

        //1.length()
        int value = name.length();
        System.out.println(value);

        //2.toLowerCase()
        String lc = name.toLowerCase();
        System.out.println(lc);

        //3.toUpperCase()
        String uc = name.toUpperCase();
        System.out.println(uc);

        //4.trim()
        String flower = "   tulips   ";
        String  trimmed = flower.trim();
        System.out.println(flower);
        System.out.println(trimmed);

        //5.substring()
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,6));

        // this will show an error because the word tandrita contains only 8 characters
        // System.out.println(name.substring(1,9));

        //6.replace()
        String word = "English";
        String replaced = word.replace('E', 'I');
        String replaced1 = word.replace("E" , "Ti");
        System.out.println(replaced);
        System.out.println(replaced1);

        //7.startsWith()
        System.out.println(name.startsWith("T"));

        //8.endsWith()
        System.out.println(name.endsWith("st"));

        //9.charAt()
        System.out.println(name.charAt(5));

        String place = "Hongkong";

        //10.indexOf()
        System.out.println(place.indexOf('n'));
        System.out.println(place.indexOf('n', 5));

        //11.lastIndexOf()
        System.out.println(place.lastIndexOf('n',5));

        //12.equals()
        System.out.println(place.equals("Hongkong"));

        //13.equalsIgnoreCase()
        System.out.println(place.equalsIgnoreCase("hongkong"));

        //escape sequence
        System.out.println("I \twant to \neat \"IceCream\"");

        //concatenation
        int a = 1;
        String b = " Icecream";
        System.out.println(a+b);

        System.out.println();

        //Math.method
        System.out.println(Math.min(5, 10));
        System.out.println(Math.max(5, 10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4));
        System.out.println(Math.random());
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);


    }
}
