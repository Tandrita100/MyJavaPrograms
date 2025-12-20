package com.JavaPrograms;

class employee{
private String name;
private int salary;
    public employee(){
        name = "ramu";
        salary = 50000;
    }
//    public employee(String myname, int mysalary){
//        name = myname;
//        salary = mysalary;
//    }
    public String getname(){
        return name;
    }
    public int getsalary(){
        return salary;
    }
}

public class employee {
    public static void main(String[] args) {
        employee job = new employee();
        System.out.println(job.getname());
        System.out.println(job.getsalary());
    }
}
