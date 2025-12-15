package com.JavaPrograms;

class Animals{
    public String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        System.out.println("Animal sounds-");
        this.a = a;
    }
}

class Wolf extends Animals{
   public String w;

    public String getW() {
        return w;
    }

    public void setW(String w) {
        System.out.println("aouuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        this.w = w;
    }
}

class cat extends Wolf{
    public String c;

    public String getC() {
        return c;
    }

    public void setC(String c) {
        System.out.println("meowwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
        this.c = c;
    }
}

class Dog extends cat{
    public String d;

    public String getD() {
        return d;
    }

    public void setD(String d) {
        System.out.println("bhaw bhaw");
        this.d = d;
    }
}
public class InheritancePractice {
    public static void main(String[] args) {

        //object for Animal
        Animals jaanwar = new Animals();
        jaanwar.setA("animals");
        System.out.println(jaanwar.getA());

        //object for Wolf
        Wolf bhediya = new Wolf();
        System.out.println(1);
        bhediya.setW("wolf");
        System.out.println(bhediya.getW());

        //object for cat
        cat billu = new cat();
        System.out.println(2);
        billu.setC("billi mausi");
        System.out.println(billu.getC());

        //object for dog
        Dog dogie = new Dog();
        System.out.println(3);
        dogie.setD("dogie");
        System.out.println(dogie.getD());

    }
}
