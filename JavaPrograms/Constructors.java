package com.JavaPrograms;
class merebaccho{
    private int marks;
    private String name;

    public merebaccho(){
        this.marks = 2;
        this.name = "tanjiro";
    }
    public merebaccho(String myname, int mymarks){
        this.marks = mymarks;
        this.name = myname;
    }

    public String getname(){
        return name;
    }

    public int getmarks(){
        return marks;
    }
 }
public class Constructors {
    public static void main(String[] args) {
        merebaccho stud1 = new merebaccho();
        System.out.println(stud1.getmarks());
        System.out.println(stud1.getname());
    }
}
