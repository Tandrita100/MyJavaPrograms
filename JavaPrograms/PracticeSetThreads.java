package com.JavaPrograms;

class GMthread extends Thread{
    public void run() {
        while (true) {
            System.out.println("GOOD MORNING!!!");
        }
    }
}
class Wthread extends Thread {
    public void run() {
        while (true) {
            //q2
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Welcome...");
        }
    }
}
class xthread extends Thread{
    public void run() {
        System.out.println("Welcome...");
    }
}
public class PracticeSetThreads {
    public static void main(String[] args) {
        //q1
        GMthread GM = new GMthread();
        Wthread W = new Wthread();
        //GM.start();
        //q3
        GM.setPriority(4);
        System.out.println(GM.getPriority());
        //W.start();
        W.setPriority(7);
        System.out.println(W.getPriority());
        //q4
        System.out.println(W.getState());

        System.out.println();

        xthread x = new xthread();
        System.out.println(x.getState());
        x.start();
        System.out.println(x.getState());
        //q5
        System.out.println(x.currentThread().getState());
    }
}
