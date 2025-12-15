package com.practice;

class MyEmployee{
   int id;
   int salary;

   public MyEmployee(){
       id = 1;
       salary = 10000;
   }
   public MyEmployee(int i){
       id = i;
   }
   public MyEmployee(int i ,int s){
       id = i;
       salary = s;
   }

   public int getid(){
       return id;
   }

   public int getSalary(){
       return salary;
   }

}
public class MyConstructors{
    public static void main(String[] args) {
    MyEmployee emp = new MyEmployee(2 , 20000);
    System.out.println("The employee id is " + emp.getid());
    System.out.println("The employee salary is " + emp.getSalary());
    }
}
