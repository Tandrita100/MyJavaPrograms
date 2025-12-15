package com.JavaPrograms;

//Q1,Q2
abstract class pen{
    abstract void write ();
    abstract void refill ();
}

class fountainpen extends pen{
    @Override
    public void write() {
        System.out.println("write a letter with this pen.");
    }
    public void refill() {
        System.out.println("Refill the pen.");
    }
    public void changeNib(){
        System.out.println("change the nib of pen.");
    }
}

//Q3
interface animal{
    public void eat();
    public void sleep ();
}
class monkey{
    public void jump(){
        System.out.println("The monkey is jumping.");
    }
    public void bite(){
        System.out.println("ouch! The monkey bit me.");
    }
}

class human extends monkey implements animal{
    @Override
    public void eat() {
        System.out.println("we are eating food.");
    }
    public void sleep() {
        System.out.println("we will sleep after a while.");
    }
    public void sing(){
        System.out.println("I can sing");
    }
}

//Q4
abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnected();
}

class smartTelephone extends telephone{
    public void ring(){
        System.out.println("Telephone is ring.");
    }
    public void lift(){
        System.out.println("Lifting the Telephone.");
    }
    public void disconnected(){
        System.out.println("Telephone is disconnected.");
    }
}

//Q6,Q7
interface TVremote{
    public void changeChannel();
}

interface smartTVremote extends TVremote{
    public void controlmediaplayer();
}

class TV implements TVremote,smartTVremote{
    @Override
    public void changeChannel() {
        System.out.println("change the channels.");
    }
    public void controlmediaplayer(){
        System.out.println("play some music");
    }
}
public class PractiseSetAbstractClassAndInterfaces {
    public static void main(String[] args) {

        //Question1And2
        fountainpen pen = new fountainpen();
        pen.write();
        pen.refill();
        pen.changeNib();

        System.out.println();

        //Question3
        human hum = new human();
        hum.jump();
        hum.bite();
        hum.eat();
        hum.sleep();
        hum.sing();

        System.out.println();

        //Question4
        //smartTelephone smt = new telephone(); //not allowed
        smartTelephone smt = new smartTelephone();
        smt.ring();
        smt.lift();
        smt.disconnected();

        System.out.println();

        //Question5
        monkey mon = new human();
        mon.bite();
        mon.jump();
        //mon.sing() ---> not allowed because monkey does not have sing method.

        //human human = new monkey(); --> not allowed
        human human = new human();
        human.bite(); // allowed because of inheritance

        animal ani = new human();
        ani.eat();
        //ani.jump() --> not allowed because animal does not have jump method.

        System.out.println();

        //Question6And7
        TV tv = new TV();
        tv.changeChannel();
        tv.controlmediaplayer();

    }
}
