package com.learningJava;

public abstract class abstractClassCellPhone {
    public abstract void ring();
    public abstract void call();
    public void buzz(){
        System.out.println("buzzing\n");
    }

    public static void main(String [] args){
        samsungPhone s = new samsungPhone();
        System.out.println("features of samsung phone-");
        s.ring();
        s.call();
        s.clickPhotos();
        s.vibrate();

        iPhone i = new iPhone();
        System.out.println("features of iphone-");
        i.ring();
        i.call();
        i.recordVideo();
        i.vibrate();

        OnePlus o = new OnePlus();
        System.out.println("features of OnePlus-");
        o.ring();
        o.call();
        o.recordAudio();
        o.vibrate();

    }
}

class samsungPhone extends abstractClassCellPhone{
    public void call() {
        System.out.println("calling...");
    }
    public void ring() {
        System.out.println("ring ring ring");
    }
    public void clickPhotos() {
        System.out.println("click click click");
    }
    public void vibrate(){
        buzz();
    }
}

class iPhone extends abstractClassCellPhone{
    public void call() {
        System.out.println("calling...");
    }
    public void ring() {
        System.out.println("ring ring ring");
    }

    public void recordVideo() {
        System.out.println("record videos");
    }
    public void vibrate(){
        buzz();
    }
}

class OnePlus extends abstractClassCellPhone{
    public void call() {
        System.out.println("calling...");
    }
    public void ring() {
        System.out.println("ring ring ring");
    }
    public void recordAudio() {
        System.out.println("record audio");
    }
    public void vibrate(){
        buzz();
    }
}
