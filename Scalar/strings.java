package com.Scalar;

public class strings {
    public static void main(String[] args) {
        String st = "Marshmallow";
        System.out.println(st);
        System.out.println(st.length());
        System.out.println(st.charAt(5));
        System.out.println(st.charAt(4));
        System.out.println(st.charAt(6));
        System.out.println(st.charAt(8));

        System.out.println("apple".toUpperCase());
        System.out.println("GOOD MORNING".toLowerCase());

        String up = st.toUpperCase();
        System.out.println(up);
        System.out.println(st);

        String s1 = "ash";
        String s2 = "ash";
        String s3 = new String("ash");

        if (s1==s3){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        if (s1.equals(s3)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }


        String anime = "one piece";
        System.out.println(anime.indexOf("e"));          //2
        System.out.println(anime.lastIndexOf("e"));  //8
        System.out.println(anime.indexOf("a"));          //-1

        String flower = "poppy";
        System.out.println(flower.indexOf("py"));       //3
        System.out.println(flower.indexOf("ppy"));      //2
        System.out.println(flower.contains("op"));
        System.out.println(flower.contains("opy"));

        String food = "i want tacos. tacos are good ";
        System.out.println(food);
        System.out.println(food.replace("tacos","fries"));

        String greeting = "Good Afternoon";
        System.out.println(greeting);
        System.out.println(greeting.substring(4));
        System.out.println(greeting.substring(4,10));      //end index-1

        String s = "hello";
        String t = "peter";
        int y = 5;
        System.out.println(s+t);
        System.out.println(s+y+t);

    }
}
