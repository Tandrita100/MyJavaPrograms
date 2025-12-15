package com.PracticePrograms.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
public class ComparatorTest {
    public static void main(String[] args){

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Ichigo",65));
        list.add(new Student("Tachibana",49));
        list.add(new Student("Atshushi",73));
        list.add(new Student("Satoru",28));

        Collections.sort(list, new NameComparator());

        for(Student e : list){
            e.printStudents();
        }
    }
}
