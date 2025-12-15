package com.Scalar;

class caar {
    String model;
    String color;
    int price;
    boolean isLocked = false;

    caar() {
        System.out.println("constructor1");
        model = "ford";
        color = "white";
        price = 100000;
    }

    caar(String model, String color, int price) {
        System.out.println("constructor2");
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //methods
    void drive() {
        System.out.println("VROOM...VROOM...VROOM...");
    }

    void lock() {
        isLocked = true;
        System.out.println("car is locked.");
    }

    void unlock() {
        isLocked = false;
        System.out.println("car is unlocked.");
    }

    //getter
    int getprice() {
        return price;
    }

    //setter
    void setprice(int price) {
        this.price = price;
    }
}

    public class constructors {
        public static void main(String[] args) {
            caar c = new caar("hyundai", "red", 200000);
            System.out.println(c.model);
            System.out.println(c.color);
            System.out.println(c.price);


//        System.out.println(c.color);
//        System.out.println(c.model);
//        //System.out.println(c.price);
//        System.out.println(c.getprice());
//        c.drive();
//        c.lock();
//        //c.unlock();
//        System.out.println(c.isLocked);

            System.out.println();

            caar c2 = new caar();
            System.out.println(c2.model);
            System.out.println(c2.color);
            System.out.println(c2.price);


//        c2.color = "black";
//        System.out.println(c2.color);
//        c2.unlock();
//        System.out.println(c2.isLocked);
//        c2.setprice(500000);
//        System.out.println(c2.getprice());
        }
    }


