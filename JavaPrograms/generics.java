package com.JavaPrograms;

import java.util.ArrayList;

class mygenerics<T1,T2,val>{
    int val = 45;
    private T1 t1;
    private T2 t2;

    public mygenerics(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}

public class generics {
    public static void main(String[] args) {
        //Arraylist of only integers -
        // Here <Integer> is a generic
        ArrayList<Integer> ar = new ArrayList<>();
       // ArrayList<int> ar = new ArrayList<>();  --> gives an error
        //ArrayList ar = new ArrayList();
       // arr.add("hi"); will cause an error.
        ar.add(5);
        ar.add(15);
        ar.add(52);
        int b = ar.get(1);
        System.out.println(b);
        //int c = ar.get(0);       //this line will cause a runtime error(a bug). so, it is not a good practise.

        //Arraylist of different things
        ArrayList arr = new ArrayList();
        arr.add("hi");
        arr.add(7);
        arr.add(67);
        //we cant directly acces an interger value from this arraylist . so. we need to typecast
       // int a = arr.get(2);
        int a = (int)arr.get(2);
        System.out.println(a);

        mygenerics<String, String, Integer> g1 = new mygenerics(45, "hulo" , "yooooo");
        String s = g1.getT1();
        System.out.println(s);
        String p = g1.getT2();
        System.out.println(p);
        int i = g1.getVal();
        System.out.println(i);



    }
}
