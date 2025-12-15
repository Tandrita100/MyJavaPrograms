package com.Scalar;

class complexnum{
    int realnum ;
    int imaginarynum;

    complexnum(int realnum,int imaginarynum){
       this.realnum = realnum;
       this.imaginarynum = imaginarynum;
    }
//    void print(){
//        System.out.println(realnum + " + " + imaginarynum + "i");
//    }

    public String toString(){
        return realnum + " + " + imaginarynum + "i";
    }

    complexnum add(complexnum c2){
        int sumrealnum = realnum + c2.realnum;
        int sumimaginarynum = imaginarynum +c2.imaginarynum;
        complexnum result = new complexnum(sumrealnum ,imaginarynum);
        return result;
    }
}
public class complexnumber {
    public static void main(String[] args) {
        complexnum c1 = new complexnum(-5,7);
//        c1.realnum = 4;
//        c1.imaginarynum = 6;
       // c1.print();
        System.out.println(c1);

        complexnum c2 = new complexnum(6,4);
//        c2.realnum = 5;
//        c2.imaginarynum = 2;
       // c2.print();
        System.out.println(c2);

        complexnum c3 = c1.add(c2);
        //c3.print();
        System.out.println(c3);

    }
}
