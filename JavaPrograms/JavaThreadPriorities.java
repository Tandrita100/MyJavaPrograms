package com.JavaPrograms;

class yourthread extends Thread{
    public yourthread(String name){
        super(name);
    }
    public void run() {
        while (true) {
            System.out.println("RUNNNNNNNNNNNNNNNNNN");
            System.out.println("Hello " + this.getName());
            System.out.println("I'm thread :"+Thread.currentThread().getPriority());
        }
    }
}
public class JavaThreadPriorities {
    public static void main(String[] args) {
        yourthread thr1 = new yourthread("My little mermaid1");
        yourthread thr2 = new yourthread("My little mermaid2");
        yourthread thr3 = new yourthread("My little mermaid3");
        yourthread thr4 = new yourthread("My little mermaid4");
        yourthread thr5 = new yourthread("My little mermaid5");
        yourthread thr6 = new yourthread("My little mermaid6");
        thr1.setPriority(Thread.MIN_PRIORITY);
        thr2.setPriority(Thread.NORM_PRIORITY);
        thr3.setPriority(Thread.NORM_PRIORITY);
        thr4.setPriority(Thread.NORM_PRIORITY);
        thr5.setPriority(Thread.NORM_PRIORITY);
        thr6.setPriority(Thread.MAX_PRIORITY);
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
        thr6.start();
    }
}
