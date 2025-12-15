package com.practice;

class Employee{
   int salary;
   String Name;

   public int getSalary(){
       return salary;
   }
   public String getName(){
       return Name;
   }
   public void setName(String n){
       Name = n;
   }
}

class Cellphone{
    public void ring(){
        System.out.println("Cell phone is Ringing");
    }
    public void vibrate(){
        System.out.println("Cell phone is vibrating");
    }
}

class Square{
    int side;
    int area;
    int parameter;
    public int area(){
        return side*side;
    }
    public int parameter(){
        return 4*side;
    }
}

class Rectangle{
    int length;
    int breadth;
    int area;
    int parameter;
    public int area(){
        return length*breadth;
    }
    public int parameter(){
        return 2 * (length + breadth);
    }
}

class circle{
    double radius;
    double area;
    double parameter;
    public double area(){
        return 3.14*radius*radius;
    }
    public double parameter(){
        return 2 * (3.14 * radius);
    }
}

class TommyVecetti{
    public void Hitting(){
        System.out.println("Hitting");
    }
    public void Running(){
        System.out.println("Running");
    }
    public void Firing(){
        System.out.println("Firing");
    }
}
public class Oopsquestions {
    public static void main(String[] args) {

    //problem1
    Employee emp = new Employee();
    emp.salary = 50000;
    System.out.println("Employee salary is: " + emp.getSalary());

    emp.setName("vagan");
    System.out.println("Employee name is: " + emp.getName());

    System.out.println();
    //problem2
    Cellphone phone = new Cellphone();
    phone.ring();
    phone.vibrate();

    System.out.println();
    //problem3
    Square sq = new Square();
    sq.side = 10;
    System.out.println("Area of square is " + sq.area());
    System.out.println("Parameter of square is " + sq.parameter());

    System.out.println();
    //problem4
    Rectangle rect = new Rectangle();
    rect.length = 6;
    rect.breadth = 3;
    System.out.println("Area of Rectangle is " + rect.area());
    System.out.println("Parameter of Rectangle is " + rect.parameter());

    System.out.println();
    //problem5
    circle cir = new circle();
    cir.radius = 2;
    System.out.println("Area of circle is " + cir.area());
    System.out.println("Parameter of circle is " + cir.parameter());

    System.out.println();
    //problem6
    TommyVecetti tom = new TommyVecetti();
    tom.Hitting();
    tom.Firing();
    tom.Running();
    }
}
