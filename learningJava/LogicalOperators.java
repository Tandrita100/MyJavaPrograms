package com.learningJava;

public class LogicalOperators {
    public static void main(String [] args){

        int a = 2;
        int b = 3;

        // &
        if(a<b & b>a){     // true
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        // &
        if(a<b & b<a){     // false
            System.out.println("true");
        }else{
            System.out.println("false");
        }//

        // |
        if(a<b | b>a){     // true
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        // |
        if(a<b | b<a){      // true
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        // using shorthand && and ||
        // the results will be same but will be more optimized

        // &&
        if(a<b && b>a){     // true
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        // &&
        if(a<b && b<a){     // false
            System.out.println("true");
        }else{
            System.out.println("false");
        }//

        // |
        if(a<b || b>a){     // true
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        // |
        if(a<b || b<a){      // true
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        // X-OR operator (^)
        //it turns the truth result to false and false to truth

        System.out.println("X-OR is : " + ((2<5) ^ (5>3))); //it should be true but ^ will be false
    }
}
