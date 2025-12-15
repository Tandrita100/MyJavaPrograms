package com.Scalar;

class car{
    String model = "ford";
    String color = "white";
    int price = 100000;
    boolean isLocked = false;

    //methods
    void drive(){
        System.out.println("VROOM...VROOM...VROOM...");
    }

    void lock(){
        isLocked = true;
        System.out.println("car is locked.");
    }

    void unlock(){
        isLocked = false;
        System.out.println("car is unlocked.");
    }

    //getter
    int getprice(){
        return price;
    }

    //setter
    void setprice(int price){
        this.price = price;
    }

}
public class vehicle{
    public static void main(String[] args) {
        car c = new car();
        System.out.println(c.color);
        System.out.println(c.model);
        //System.out.println(c.price);
        System.out.println(c.getprice());
        c.drive();
        c.lock();
        //c.unlock();
        System.out.println(c.isLocked);

        System.out.println();

        car c2 = new car();
        c2.color = "black";
        System.out.println(c2.color);
        c2.unlock();
        System.out.println(c2.isLocked);
        c2.setprice(500000);
        System.out.println(c2.getprice());
    }
}
