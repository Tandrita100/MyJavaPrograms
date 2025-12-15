package com.JavaPrograms;

//Below are the commonly used constructors of the thread class:
class mythread123 extends Thread{
    public mythread123(String name){
        super(name);
        System.out.println(name);
    }
    public void run(){
        int i = 0;
        while(i<10) {
            System.out.println("Hi i am thread.");
            i++;
        }
    }
}

class mythread456 implements Runnable{
    public void run(){
        System.out.println("yo koso!!!");
        System.out.println("watashi no soul society");
    }
}
class mythread444 extends Thread{
    public mythread444(Runnable r, String name){
        super(name);
        System.out.println(name);
    }
}

public class ThreadConstructors {
    public static void main(String[] args) {
        mythread123 th1 = new mythread123("tanu");
        mythread123 th2 = new mythread123("Mota");
        th1.start();
        th2.start();
        System.out.println("the id of th1 is " + th1.getId());
        System.out.println("the name of th1 is " + th1.getName());
        System.out.println("the class of th1 is " + th1.getClass());
        System.out.println("the id of th1 is " + th2.getId());
        System.out.println("the name of th1 is " + th2.getName());
        System.out.println("the class of th1 is " + th2.getClass());

        System.out.println();
        mythread456 th3 = new mythread456();
        Thread r = new Thread(th3);
        r.start();

        mythread444 th11 = new mythread444(r,"kira"); //we have to provide runnable here
        th11.start();
    }
}