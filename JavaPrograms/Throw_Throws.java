package com.JavaPrograms;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius can not be negative";
    }
    public String getMessage() {
        return "Radius can not be negative";
    }
}
public class Throw_Throws {
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        return Math.PI * r * r;
    }
    public static int divide (int a,int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
            int c = divide(6, 0);    // it throws arithmetic exception.
            System.out.println(c);
        }catch (Exception e){
            System.out.println("Some Exception occurred " + e);
        }

        System.out.println();

        //2nd method
        try {
            double ar = area(-4);
            System.out.println(ar);
        }catch(Exception e1){
            System.out.println(e1);
        }
    }
}
