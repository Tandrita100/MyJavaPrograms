package com.JavaPrograms;

class colors{
    public void blue(){
        System.out.println("The sky is blue.");
    }
    public void red(){
        System.out.println("haha, you turned all red.");
    }
}

class colors2 extends colors{
    //method overriding
    @Override
    public void blue(){
        System.out.println("Love me blue.");
    }
    public void yellow(){
        System.out.println("she put my name in yellow hearts.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        colors col = new colors();
        col.blue();
        col.red();
        System.out.println();

        colors2 col2 = new colors2();
        col2.blue();
        col2.red();
        col2.yellow();


    }
}
