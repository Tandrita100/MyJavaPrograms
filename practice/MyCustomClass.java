package com.practice;

class Students{
    int Rollno ;
    String Name ;
    long Phonenum ;

    public String Name(){
        System.out.println("My name is " + Name);
        return Name;
    }
    public int Rollno(){
        System.out.println("My roll is " + Rollno);
        return Rollno;
    }
    public long Phonenum(){
        System.out.println("My phonenum is " + Phonenum);
        return Phonenum;
    }

}
public class MyCustomClass {
    public static void main(String[] args) {
    Students stud1 = new Students();
    Students stud2 = new Students();
    Students stud3 = new Students();

    stud1.Rollno = 20;
    stud1.Name = "Geralt";
    stud1.Phonenum = 8764537863l;

    stud2.Rollno = 21;
    stud2.Name = "Yenefer";
    stud2.Phonenum = 8235373453l;

    stud3.Rollno = 22;
    stud3.Name = "Cirilla";
    stud3.Phonenum = 9235333455l;


    //printing
    stud1.Rollno();
    stud1.Name();
    stud1.Phonenum();

    System.out.println("");

    stud2.Rollno();
    stud2.Name();
    stud2.Phonenum();

    System.out.println("");

    stud3.Rollno();
    stud3.Name();
    stud3.Phonenum();

    }
}
