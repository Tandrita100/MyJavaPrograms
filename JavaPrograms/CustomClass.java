package com.JavaPrograms;
class student{
    int Class ;
    int rollno ;
    float percentage;
    String Hobby;
    String name;
    public void details(){
        System.out.println("Hello i am " + name + " and my rollno. is " + rollno);
    }
    public float getPercentage(){
        return percentage;
    }
    public int Class(){
        return Class;
    }
    public String getHobby(){
        return Hobby;
    }
}

class Employee{
    int id ;
    String name;
    int salary;
   // long MobNum ;

    public void Employeedetails(){
        System.out.println("Hello i am " + name + " and my id is " + id);
    }
    public int getsalary(){
        return salary;
    }
//    public long getMobNum(){
//        return MobNum;
//    }

}

public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This a custom class");
        System.out.println(" ");  //to print a blank line
        student Denji = new student();
        student Aki = new student();

        //details of Denji
        Denji.rollno = 23;
        Denji.percentage = 56;
        Denji.name = "chainsawman";
        Denji.Class = 1;
        Denji.Hobby = "to eat good food";

        //details of Aki
        Aki.rollno = 12;
        Aki.percentage = 86;
        Aki.name = "Aki Hayakawa";
        Aki.Class = 2;
        Aki.Hobby = "to slay Devils";

        //printing the details
        Denji.details();
        int Cls1 = Denji.Class();
        System.out.println("I study in class "+ Cls1);

        float Percentage1 = Denji.getPercentage();
        System.out.println("My overall percentage is: " + Percentage1 + "%");

        String hobby1 = Denji.getHobby();
        System.out.println("And I love " + hobby1);

        System.out.println(" ");  //to print a blank line

        Aki.details();
        int Cls2 = Aki.Class();
        System.out.println("I study in class "+ Cls2);

        float Percentage2 = Aki.getPercentage();
        System.out.println("My overall percentage is: " + Percentage2 + "%");

        String hobby2 = Aki.getHobby();
        System.out.println("And I love " + hobby2);

        System.out.println(" "); //to print a blank line

        Employee makima = new Employee();
        Employee power = new Employee();

        //Details of Employee1
        makima.name = "Makima";
        makima.id = 100;
        makima.salary = 2000;

        //Details of Employee2
        power.name = "Power";
        power.id = 101;
        power.salary = 10;

        //printing the Details
        makima.Employeedetails();
        int salary1 = makima.getsalary();
        System.out.println("I earn "+ salary1);

        power.Employeedetails();
        int salary2 = power.getsalary();
        System.out.println("I earn "+ salary2);
    }
}
