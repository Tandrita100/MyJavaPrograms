package com.JavaPrograms;

public class RelationalAndLogicalOperators {
    public static void main(String[]args){
        System.out.println("Logical AND operator-");
        boolean a = true;
        boolean b = false;
        if (a && b) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println("Logical OR operator-");
        if (a || b) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println("Logical NOT operator-");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);

        if (a != b) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }

}
