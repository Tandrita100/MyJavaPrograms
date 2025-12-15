package com.PracticePrograms.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest{
    public static void main(String [] args){

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Alex",43));
        employees.add(new Employee(2,"Zemo",36));
        employees.add(new Employee(3,"Peter",28));
        employees.add(new Employee(4,"Loki",52));

        Collections.sort(employees);

        for (Employee e : employees){
            System.out.println(e.id+" "+e.name+" "+e.age);
        }
    }
}
