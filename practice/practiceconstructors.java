package com.practice;

class Cylinder{
    int radius;
    int height;

    public Cylinder(int r, int h) {
        radius = r;
        height = h;
    }

    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int h){
        height = h;
    }
    public int getHeight(){
        return height;
    }

    public double surfaceArea(){
        return 2 * (Math.PI * radius * height) + 2 * (Math.PI * radius * radius);
    }
    public double Volume(){
        return Math.PI * radius * radius * height;
    }
}

class rectangles{
    int length;
    int breadth;
    public rectangles(){
         length = 4;
         breadth = 5;
    }
    public rectangles(int l ,int b){
        length = l;
        breadth = b;
    }
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

}


public class practiceconstructors {
    public static void main(String[] args) {
    Cylinder cyl = new Cylinder(4, 5);
    cyl.setRadius(2);
    System.out.println("Radius: " + cyl.getRadius());
    cyl.setHeight(5);
    System.out.println("Height: " + cyl.getHeight());
    System.out.println("The surface area of cylinder is " + cyl.surfaceArea());
    System.out.println("The Volume of cylinder is " + cyl.Volume());

    System.out.println();

    rectangles rec = new rectangles(34 , 7);
    rectangles rec1 = new rectangles();
    System.out.println("Length: " + rec.getLength());
    System.out.println("Breadth: " + rec.getBreadth());
    System.out.println(rec1.getLength());
    System.out.println(rec1.getBreadth());



    }
}
