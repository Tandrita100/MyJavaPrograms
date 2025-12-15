package com.practice;

class Fruits{
    String f;
    public void fruits(){
        System.out.println("These are different types of fruits");
    }
    public String getfruits(){
        return f;
    }
    public void setfruits(String f){
         this.f = f;
}

}
class fal extends Fruits{
    String b;
    public String getfru(){
        return b;
    }
    public void setfru(String b){
        this.b = b;
    }

}
public class Inheritance {
    public static void main(String[] args) {
        Fruits fru = new Fruits();
        fru.setfruits("Apple");
        System.out.println(fru.getfruits());

        Fruits fru1 = new Fruits();
        fru.setfruits("Apple");
        System.out.println(fru.getfruits());
        fru1.setfruits("banana");
        System.out.println(fru1.getfruits());
    }
}
