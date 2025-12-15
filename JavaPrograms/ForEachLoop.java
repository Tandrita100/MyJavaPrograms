package com.JavaPrograms;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] names = {"luffy", "ichigo", "eren", "tanjiro", "yagami", "denji"};
        int[] num = {10, 20, 30, 40, 50, 60};

        //printing the array using simple way
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        System.out.println(names[5]);

        System.out.println(num[3]);
        System.out.println(num[5]);
        System.out.println(num[1]);

        System.out.println(names.length);
        System.out.println(num.length);

        float[] decimalnum = {4.2f, 3.4f, 2.3f, 5.8f};
        System.out.println(decimalnum[3]);
        System.out.println(decimalnum.length);

        //printing the array using for loop
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(i);   //this will only print the length
//   }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]); //this will print the names present in the array, it is known as array traversal.
        }

        //Quiz
        //to print the array in reverse order by using for loop (decrementing loop)
        System.out.println("\nIn reverse order:");
         for (int i = names.length -1; i>=0; i--) {
             System.out.println(names[i]);


        //for each loop
        System.out.println("using for each loop");
        for(int element:num){
            System.out.println(element);
        }

        //this loop ( for each loop )is used to print the elements 1 by 1.(by using elements.arrayname)

       System.out.println("using for each loop");
       for(String element:names){
            System.out.println(element);
          }

       System.out.println("using for each loop");
       for(float element:decimalnum){
            System.out.println(element);
           }

        }
    }
  }





  
