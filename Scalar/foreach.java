package com.Scalar;

public class foreach {
    public static void main(String[] args) {
        String [] color = {"blue","green","purple","black","red"};
        boolean foundcolor = false;
        for (String element:color) {
             if(element=="brown"){
                 foundcolor = true;
             }
        }
        if(foundcolor){
            System.out.println("found the color");
        }else{
            System.out.println("Not found");
        }
    }
}
