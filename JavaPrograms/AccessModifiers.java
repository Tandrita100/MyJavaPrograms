package com.JavaPrograms;
class MyStudents{
   private int Id;
   private String name;

   public void setId(int i){
        Id = i;
   }
   public int getId(){
       return Id;
   }
    public void setname(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        MyStudents stud = new MyStudents();
        stud.setId(2);
        System.out.println(stud.getId());
        stud.setname("ishuuuuuuuuuuuuu");
        System.out.println(stud.getname());
    }

    //circle program to set radius area and parameter and to warn if i set anything wrong

}
