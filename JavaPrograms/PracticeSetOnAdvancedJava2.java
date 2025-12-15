package com.JavaPrograms;

import java.io.FileWriter;
import java.io.IOException;

class q1{
    @Deprecated
    public int add(int a, int b){
        return a+b;
    }

    public void multiply(int c){

    }
}

@FunctionalInterface
interface interfacedemo{
    public void method();
}

public class PracticeSetOnAdvancedJava2 {
    public static void main(String[] args) {

        //Problem1 + 2
        @SuppressWarnings("deprication")
        q1 q = new q1();
        System.out.println(q.add(595, 865));

        //Problem3
//        interfacedemo id = new interfacedemo() {
//            @Override
//            public void method() {
//                System.out.println("I am a method.");
//            }
//        };
//        id.method();

        //another method
        interfacedemo id = ()->{
            System.out.println("hehehehehe");
        };
        id.method();

        //Problem4
//        for(int c=2;c<5;c++){
//            multiply(c);
//        }
        int c = 45;
        String table = "";
        for(int i=0;i<=10;i++){
            table += c + "x" + i+1 + "=" + c*(i+1);
            table += "\n";
        }
        try{
            FileWriter file = new FileWriter("MultiplicationTable");
            file.write(table);
            file.close();
        }catch(IOException e){
            e.printStackTrace();
        }





    }
}
