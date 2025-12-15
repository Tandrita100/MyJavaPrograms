package com.JavaPrograms;

class circle1{
    public int r;
    circle1(){
        System.out.println("i am a circle with no radius.");
    }
    circle1(int r){
        this.r = r;
        System.out.println("i am a circle with a radius.");
    }
    public double area(){
        return Math.PI*r*r;
    }
}
class cylinder1 extends circle1{
    public int h;
    cylinder1(){
        System.out.println("i am a cylinder with no radius and no height.");
    }
    cylinder1(int r,int h){
        super(r);
        this.h = h;
        System.out.println("i am a cylinder with a radius and a height.");
    }
    public double volume(){
        return Math.PI*r*r*h;
    }
}

class rectangle1{
    public int l;
    public int b;
    rectangle1(){
        System.out.println("i am a rectangle with no length and breadth.");
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    rectangle1(int l, int b){
        this.l = l;
        this.b = b;
        System.out.println("i am a rectangle with a length and breadth.");
    }
    public int area(){
        return l*b;
    }
}
class cuboid extends rectangle1{
    public int h;
    cuboid (){
        System.out.println("i am a cuboid with no length and breadth.");
    }
    cuboid (int l,int b,int h){
        super(b,l);
        this.h = h;
        System.out.println("i am a cylinder with a length ,breadth and height.");
    }
    public int volume(){
        return l*b*h;
    }
}
public class PracticeSetInheritance {
    public static void main(String[] args) {

        //Question1
        circle1 cir = new circle1(6);
        System.out.println();
        cylinder1 cyl = new cylinder1(8,9);

        System.out.println();

        //Question2
        rectangle1 rec = new rectangle1(5,4);
        System.out.println("Area of rectangle:");
        System.out.println(rec.area());
        System.out.println();
        cuboid cub = new cuboid(8,9,7);
        System.out.println("Volume of cuboid:");
        System.out.println(cub.volume());

        System.out.println();

        //Question3
        System.out.println("Area of circle:");
        System.out.println(cir.area());
        System.out.println("Volume of cylinder:");
        System.out.println(cyl.volume());

        //Question4
        rec.setB(4);
        System.out.println(rec.getB());

        //Question5
        //order is Base-->Derived1-->Derived2
    }
}
