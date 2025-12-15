package com.JavaPrograms;

public class FinallyBlock {
    public static int div(){
        try {
            int a = 30;
            int b = 0;
            int c = a / b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
// no matter what the case is finally block contents will always print.but here if i don't put "end of program" inside finally it
// will not print if exception occurs.
        finally {
            System.out.println("end of program");
        }
        return 0;
    }

    public static void main(String[] args) {


        //In this program the "end of program" will print whether i put it inside finally or not.
        /*
        try {
            int a = 30;
            int b = 0;
            int c = a / b;

        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("end of program");
        }

       */

        //to understand finally block properly-
        int u = div();
        System.out.println(u);

        System.out.println();

        //other example
        int a = 50;
        int b = 10;
        while(true){
            try{
                System.out.println(a/b);
            }catch(Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("finallly.. the value of b is " + b);
                b--;
            }
        }

        // we cannot use try alone without catch but we can use it with finally without catch.
        try{
            System.out.println(3/0);
        }finally{
            System.out.println("the end...");
        }

    }
}
