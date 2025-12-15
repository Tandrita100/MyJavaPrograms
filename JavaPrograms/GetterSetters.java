package com.JavaPrograms;
import java.util.Scanner;
class calculations{
    private int A;
    private int B;
    private int Sum;

    public void setA(int a){
         A = a;
    }

    public int getA(){
        return A;
    }

    public void setB(int b){
        B = b;
    }

    public int getB(){
        return B;
    }

    public void setSum(int sum){
        Sum = sum;
    }

    public int getSum(){
        return Sum;
    }
}
public class GetterSetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        calculations cal = new calculations();

        System.out.println("Enter 1nd no.");
        cal.setA(scan.nextInt());
        System.out.println("Enter 2nd no.");
        cal.setB(scan.nextInt());

        cal.setSum(cal.getA() + cal.getB());
        System.out.println("Your Total is " +cal.getSum());

    }
}
