package com.JavaPrograms;
class phone1{
    public void call(){
        System.out.println("Caliing a friend.");
    }
    public void TurnOn(){
        System.out.println("Turning the phone on.");
    }
}
class SmartPhone extends phone1{
    public void Music(){
        System.out.println("play music.");
    }
    public void TurnOn(){
        System.out.println("Turning the Smartphone on.");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        phone1 ph = new phone1();
        ph.call();
        ph.TurnOn();

        System.out.println();

        SmartPhone smp = new SmartPhone();
        smp.Music();
        smp.TurnOn();
        smp.call();

        System.out.println();

        phone1 phoo = new SmartPhone(); // it is allowed
        phoo.call();
        phoo.TurnOn();
        //phoo.Music();  ---> it is not allowed

    }
}