package com.practice;

//q1+q2
class Circle1{
    public double volume(int r){
        return (4/3) * Math.PI*r*r*r;
    }
    public double area1(int r){
        return Math.PI*r*r;
    }
}
class cylinder1 extends Circle1{
    public double volume(int r, int h){
        return Math.PI*r*2*h;
    }
    public double area2(int r, int h){
        return (2*Math.PI*r*h) + (2*Math.PI*r);
    }
}
class Rectangle1{
    public int volume1(int v,int w,int h){
        return v*w*h;
    }
    public int area3(int l, int b){
        return l*b;
    }
}
class cuboid1 extends Rectangle1{
    public int volume1(int l, int h, int b){
        return 2*((l*b) + (b*h) + (h*l));
    }
    public int area4(int l, int h, int b){
        return l*b*h;
    }
}


public class PracticeSetInheritance {
    public static void main(String[] args) {

        //q1+q3
        Circle1 C = new Circle1();
        System.out.println("The volume of a circle is : " +C.volume(5));
        System.out.println("The area of a circle is : " + C.area1(4));
        System.out.println();
        cylinder1 c = new cylinder1();
        System.out.println("The volume of a cylinder is : " + c.volume(5,6));
        System.out.println("The area of a cylinder is : " + c.area2(4,5));

        System.out.println();

        //q3+q4
        Rectangle1 r = new Rectangle1();
        System.out.println("The volume of a cylinder is : " + r.volume1(1,5,9));
        System.out.println("The area of a cylinder is : " + r.area3(6,5));
        System.out.println();
        cuboid1 cu = new cuboid1();
        System.out.println("The volume of a cylinder is : " + cu.volume1(7,8,4));
        System.out.println("The area of a cylinder is : " + cu.area4(6,7,4));

        //q5
        //the order is base --> derived1 --> derived2
    }
}
