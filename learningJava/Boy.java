package com.learningJava;

interface girl{
    public void running();
}

class MarriedGirl implements girl{
    public void running(){
        System.out.println("Married Girl is running");
    }
}

class UnmarriedGirl implements girl{
    public void running(){
        System.out.println("Unmarried Girl is running");
    }
}

public class Boy {
    public static void main(String [] args){
        girl gr = new MarriedGirl();
        gr.running();
    }
}
