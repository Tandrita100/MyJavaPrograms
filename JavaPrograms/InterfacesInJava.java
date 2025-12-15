package com.JavaPrograms;

interface bus{
    int a = 100;
   // public void accelerate(int increment);
    public void accelerate();
   // public void brake(int decrement);
    public void brake();
}

interface horn{
    int b = 2000;
    public void horn1();
    public void horn2();
}

class mahindra implements bus,horn{
    public void blowHorn(){
        System.out.println("pee pee po po");
    }

//    public void accelerate(int increment) {
//        System.out.println("speed up the bus");
//    }

    public void accelerate() {
        System.out.println("speed up the bus");
    }

//    public void brake(int decrement) {
//        System.out.println("stop the bus");
//    }

    public void brake() {
        System.out.println("stop the bus");
    }

    public void horn1() {
        System.out.println("pe po pe po pe po");
    }

    public void horn2() {
        System.out.println("pe pe po po pe po");
    }
}
public class InterfacesInJava {
    public static void main(String[] args) {
        mahindra mah = new mahindra();
        mah.blowHorn();
        //mah.accelerate(3);
        mah.accelerate();
        //mah.brake(2);
        mah.brake();
        mah.horn1();
        mah.horn2();
        System.out.println(mah.a);
        System.out.println(mah.b);
       // mah.a = 56;  ---> we can not update this variable because it is final.
    }
}
