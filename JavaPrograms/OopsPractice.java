package com.JavaPrograms;
class Employees{
    int Salary;
    String Name;

    public int getSalary(){
        return Salary;
    }

    public String getName(){
        return Name;
    }

    public void setName(String n){
        Name = n;
    }
}
class Phone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
    public void callAfriend(){
        System.out.println("calling a friend...");
    }
}
class Square {
    int side;
    public int area() {
        return side * side;
    }
    public int perimeter() {
        return 4 * side;
    }
}
class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length * breadth;
    }
    public int perimeter(){
        return 2 * (length+breadth);
    }
}
class TommyVecceti{
    public void hit(){
        System.out.println("Hit the enemy");
    }
    public void run(){
        System.out.println("Run from the enemy");
    }
    public void fire(){
        System.out.println("Fire the enemy");
    }
}
class Circle{
    float radius;
    public float area(){
        return (float)3.14 * (radius * radius);
    }
    public float parameter(){
        return (float) ((float)2 * (3.14 * radius));
    }
}

public class OopsPractice {
    public static void main(String[] args) {

        //Question1
        Employees ash = new Employees();
        ash.setName("Ash");
        ash.Salary = 5000;
        System.out.println(ash.getName());
        System.out.println(ash.getSalary());

        System.out.println(" ");

        //Question2
        Phone Samsung = new Phone();
        Samsung.ring();
        Samsung.vibrate();
        Samsung.callAfriend();

        System.out.println(" ");

        //Question3
        Square sq = new Square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        System.out.println(" ");

        //Question4
        Rectangle rec = new Rectangle();
        rec.length = 7;
        rec.breadth = 5;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());

        System.out.println(" ");

        //Question5
        TommyVecceti tom = new TommyVecceti();
        tom.hit();
        tom.run();
        tom.fire();

        System.out.println(" ");

        //Question6
        Circle cir = new Circle();
        cir.radius = 6;
        System.out.println(cir.area());
        System.out.println(cir.parameter());
    }
}
