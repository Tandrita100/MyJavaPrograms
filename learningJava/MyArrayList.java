package com.learningJava;

public class MyArrayList {
    int [] arr;
    int count;
    int capacity;

    public MyArrayList(){
        this.arr = new int[5];
        this.count = 0;
        this.capacity = 5;


    }

    void add(int a){
        if(count == capacity-1){
            capacity = capacity+5;
            int [] temp = arr;
            arr = new int[capacity];
            for(int i=0; i<temp.length; i++){
                arr[i] = temp[i];
            }
        }

        arr[count++]= a ;
    }

    void print(){
        for(int i=0; i<count;i++){
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args){
        MyArrayList list = new MyArrayList();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.print();
    }
}
