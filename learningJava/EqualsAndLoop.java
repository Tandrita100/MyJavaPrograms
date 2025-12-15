package com.learningJava;

public class EqualsAndLoop {

    public static void main(String [] args){
        String a = "monkey";
        String b = "monkey";

        String a1 = "monkey";
        String b1 = new String ("monkey");

        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(a1.equals(b1));
        System.out.println(a1==b1);

        System.out.println();

        //for loop
        String [] arr = {"charizard", "pikachu", "charizard", "bulbasaur", "pikachu"};
        for(int i = 0; i < arr.length; i++){
            System.out.println(i);  // 0 1 2 3 4
            System.out.println(arr[i]); // names
        }

        System.out.println();

        //using for each loop
        for (String element:arr) {
            System.out.println(element);
        }

        System.out.println();

        //to find the count
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        System.out.println("count : " + count);


    }

}
