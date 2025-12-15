package com.practice;

public class PracticeSet5 {
    public static void main(String[] args) {

        //Problem1
        int n = 4;
        for(int i=n;i>0;i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println();

        //Problem2
        int N = 10;
        int sum =0;
        int i1 = 1;
        while(i1<N){
            sum = sum+(2*i1);
            i1++;
        }
        System.out.println("The sum even num is " + sum);


        System.out.println();

      // Problem3
        int n1 = 5;
        for(int i=0;i<=10;i++){
            System.out.println("5 * " + i + " = " + n1*i );
        }

        System.out.println();

        //Problem4
        int b = 10;
        for(int i=10;i>=1;i--){
            System.out.println("10 * " + i + " = " + n1*i );
        }

        System.out.println();

        //Problem5
        int f = 5;
        int fact = 1;
        for(int i=1;i<=f;i++){
           fact = fact*i;
        }
        System.out.println("The factorial of 5 is " + fact);

        System.out.println();

        //Problem6
        int f1 = 4;
        int fac = 1;
        int j = 1;
        while(j<=f1){
            fac = fac*j;
            j++;
        }
        System.out.println("The factorial of 4 is " + fac);

        System.out.println();

        //Problem7
        int m = 4;
        int I = m;
        while(I>0){
            int J =0;
            while(J<I){
                System.out.print("*");
                J++;
            }
            System.out.println(" ");
            I--;
        }

        System.out.println();

        //Problem8
        System.out.println("Answer is True.");

        System.out.println();

        //Problem9
        int c = 8;
        int sum2 = 0 ;
        for(int i=0;i<=10;i++){
            sum2 = sum2+(c*i);
        }
        System.out.println("The sum is " + sum2);

        System.out.println();

        //Problem10
        System.out.println("Answer is at least Once");

        System.out.println();

        //Problem11
        int Num = 10;
        int sum1 =0;
        for(int i=0;i<Num;i++){
            sum1 = sum1+(2*i);   //2n is for even num
        }
        System.out.println("The sum even num is " + sum1);

    }
}
