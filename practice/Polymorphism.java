package com.practice;

class flower{
    void bloom(){
        System.out.println("flowers are blooming");
    }

    void colorful(){
        System.out.println("flowers are so colourful");
    }
}

class lotus extends flower{
    void leaf(){
        System.out.println("lotus have big leaves");
    }

    void grow(){
        System.out.println("lotus grow in water");
    }
}


public class Polymorphism{
    public static void main(String[] args) {
        flower f = new flower();
        f.bloom();
        f.colorful();

        System.out.println();

        flower fl = new lotus();
        fl.bloom();
        f.colorful();

        System.out.println();

        lotus l = new lotus();
        l.bloom();
        l.colorful();
        l.leaf();
        l.grow();
    }
}
