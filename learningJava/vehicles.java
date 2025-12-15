package com.learningJava;

interface car{
    public void tyres();
    public void horn();
}

interface truck{
    public void carry();
    public void deliver();
}

class ford implements car{
    public void tyres(){
        System.out.println("There should be 4 tyres");
    }

    public void horn(){
        System.out.println("pom pom pom");
    }

    public void brake(){
        System.out.println("Apply brakes");
    }
}

class mahindra implements car,truck{

    public void carry() {
        System.out.println("Carry items");
    }

    public void deliver() {
        System.out.println("Deliver items");
    }

    public void horn() {
        System.out.println("poooo pooooo");
    }

    public void tyres() {
        System.out.println("must have extra tyres for emergency");
    }

    public void accelerate(){
        System.out.println("must maintain a proper speed limit");
    }

}
public class vehicles{
    public static void main(String[] args){
        ford f = new ford();
        f.brake();
        f.tyres();
        f.horn();

        System.out.println();

        mahindra m = new mahindra();
        m.deliver();
        m.accelerate();
        m.carry();
        m.horn();
        m.tyres();
    }
}



