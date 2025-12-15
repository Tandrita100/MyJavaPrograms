package com.JavaPrograms;

class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "input can not be 8 or 9";
    }
}
class CannotDivideByZeroException extends Exception{
    @Override
    public String toString() {
        return "can not divide by 0";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "input cant be more than 100000";
    }
}
class MaxMultiplierReachedException extends Exception{
    @Override
    public String toString() {
        return "Max Multiplier cant be more than 4000000";
    }
}
class CustomCalculator{
    public int Addition(int a , int b) throws InvalidInputException{
        if(a == 8 || b == 9){
            throw new InvalidInputException();
        }
        return a + b;
    }
    public int Subtraction(int a , int b) throws MaxInputException{
        if(a>10000 || b>100000){
            throw new MaxInputException();
        }
        return a - b;
    }
    public int Multiplication(int a , int b) throws MaxMultiplierReachedException{
        if(a>4000000 || b>4000000){
            throw new MaxMultiplierReachedException();
        }
        return a * b;
    }
    public int Division(int a , int b) throws CannotDivideByZeroException{
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}
public class Exercise6CustomCalculator {
    public static void main(String[] args)throws InvalidInputException,CannotDivideByZeroException,MaxInputException,MaxMultiplierReachedException{
        CustomCalculator c = new CustomCalculator();
    //    System.out.println(c.Addition(4,9));
    //    System.out.println(c.Division(4,0));
    //    System.out.println(c.Subtraction(478,70000000));
        System.out.println(c.Multiplication(478,70000000));

    }
}
