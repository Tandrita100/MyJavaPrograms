package com.JavaPrograms;

class herthread extends Thread{
    public void run() {
        int i = 0;
       // while (i < 5000) {
        while (true) {
            System.out.println("Dhanyavaad..");
            try {
                Thread.sleep(440);   //it will wait for 600 milliseconds during the execution.
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
class herthread1 extends Thread{
    public void run() {
        int i = 0;
       // while (i < 3000) {
        while (true) {
            System.out.println("Thankyou!!");
            i++;
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        herthread hr1 = new herthread();
        herthread1 hr2 = new herthread1();
        hr1.start();
        //method1 (we need to use try catch otherwise it can cause some exceptions)
//        try{
//            hr1.join(); //it allows one thread to wait until the execution of some other specified thread is completed.
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }

        //after the completion of execution of hr1 , hr2 will start
        hr2.start();
    }
}
