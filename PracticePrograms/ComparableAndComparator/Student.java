package com.PracticePrograms.ComparableAndComparator;

public class Student {

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    String name;
    int marks;

    public Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }

    public void printStudents(){
        System.out.println("Name : " + name + " Marks : " + marks);
    }

}
