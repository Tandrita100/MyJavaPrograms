package com.learningJava.Numericals;

public class MinAndMax {

    int [] arr = {32,54,2,7,63};
    int a = 16;
    int b = 43;
    int min = arr[0];
    int max = arr[0];
    public void max(){
         for(int i=0; i<arr.length;i++){
             if(arr[i] > max){
                 max = arr[i];
             }
         }
        System.out.println("The maximum no. is " + max);

//        if(a>b){
//            System.out.println(a + " is greater than " + b);
//        }else {
//            System.out.println(b + " is greater than " + a);
//        }
    }

    public void min(){
        for(int i=0; i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The minimum no. is " + min);

//        if(a<b){
//            System.out.println(a + " is smaller than " + b);
//        }else {
//            System.out.println(b + " is smaller than " + a);
//        }
    }
    public static void main(String[] args){

        MinAndMax mm = new MinAndMax();
        mm.max();
        mm.min();

    }
}
