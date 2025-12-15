package com.learningJava;

public class UninitializedVariables {

    int a;  //primitive variable / instance variable
    String v;  //reference variable

    public static void main(String[] args){

        UninitializedVariables uv = new UninitializedVariables();
        System.out.println(uv.a); //primitive

        //reference variable
        if(uv.v!=null) {
            System.out.println(uv.v);
        }else{
            System.out.println("v is null");
        }

    }
}
