package com.PracticePrograms.ComparableAndComparator;

public class Employee  implements Comparable<Employee>{

    public int id;
    public String name;
    public int age;

    public Employee(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee e) {

        if(age == e.age){
            return 0;
        }if(age < e.age){
            return 1;
        }else {
            return -1;
        }

    }

}
