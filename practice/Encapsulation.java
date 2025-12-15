package com.practice;

class Aa{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}

public class Encapsulation {
    public static void main(String[] args){
        Aa a = new Aa();
        a.setAge(5);
        a.setName("max");
        System.out.println(a.getAge());
        System.out.println(a.getName());
    }
}
