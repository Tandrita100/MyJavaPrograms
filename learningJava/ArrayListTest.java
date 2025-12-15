package com.learningJava;

public class ArrayListTest {
    int [] arr;
    int count;
    int capacity;

    public ArrayListTest(){
        this.arr = new int[5];
        this.count = 0;
        this.capacity = 5;
    }

    /*
    void add(int a){
        arr[count++] = a;
        if(a == 4){
           int [] temp = arr;
           arr = new int[10];
           for(int i=0; i<temp.length;i++){
               arr[i] = temp[i];
           }
       }
    }
     */

    void add(int a){
        arr[count++] = a;
        if(count == capacity-1){
            capacity = capacity+5;
           int [] temp = arr;
           arr = new int[capacity];
           for(int i=0; i<temp.length;i++){
               arr[i] = temp[i];
           }
       }
    }

    void print(){
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//        System.out.println(arr[5]);
//        System.out.println(arr[6]);
//        System.out.println(arr[7]);
//        System.out.println(arr[8]);
//        System.out.println(arr[9]);
//        System.out.println(arr[10]);
        for(int i=0; i< count; i++){
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args){
          ArrayListTest ar = new ArrayListTest();
          ar.add(1);
          ar.add(2);
          ar.add(3);
          ar.add(4);
          ar.add(5);
          ar.add(6);
          ar.add(7);
          ar.add(8);
          ar.add(9);
          ar.add(10);
          ar.add(11);
          ar.add(7);
          ar.add(7);
          ar.add(7);
          ar.add(7);
          ar.add(7);
          ar.add(7);
          ar.add(7);
          ar.add(7);
          ar.add(7);
          ar.add(7);
          ar.print();

    }

}
