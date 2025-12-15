package com.practice;

public class ArrayListPractice {
    int [] arr;
    int count;
    int capacity;

    public ArrayListPractice(){
        this.arr = new int [5];
        this.count = 0;
        this.capacity = 5;
    }

    void add(int a){
        if(count == capacity-1){
            capacity = capacity+5;
            int [] temp = arr;
            arr = new int [5];
            for(int i=0; i<temp.length; i++){
                arr[i] = temp[i];
            }
        }
        arr[count++] = a;
    }

    void print(){
        for(int i=0; i<count; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        ArrayListPractice al = new ArrayListPractice();
        al.add(9);
        al.add(9);
        al.add(9);
        al.add(9);
        al.add(9);
        al.add(9);
        al.add(9);
        al.add(9);
        al.add(9);
        al.add(9);
        al.add(9);
        al.add(9);
        al.add(9);
        al.add(9);
        al.add(9);
        al.add(9);
        al.print();
    }
}
