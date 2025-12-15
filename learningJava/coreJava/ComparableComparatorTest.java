package com.learningJava.coreJava;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableComparatorTest  {
    public static void main(String[] args){

        ArrayList<Employee> eList = new ArrayList<Employee>();
        eList.add(new Employee(9, "tom", 13));
        eList.add(new Employee(10, "jerry", 6));
        eList.add(new Employee(21, "shaggy", 31));
        eList.add(new Employee(1, "scooby", 9));

        //Collections.sort(eList);
        //using comparator
        Collections.sort(eList, new nameComparator());
        for(Employee e:eList){
            System.out.println(e.id+" "+e.name+" "+e.age);
        }
        
    }
}

