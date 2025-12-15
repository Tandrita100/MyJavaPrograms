package com.JavaPrograms;

public class Arrays {
    public static void main(String[] args) {

      //method1
      int[] rollno;
      rollno = new int[5];
      rollno[0]= 1;
      rollno[1]= 2;
      rollno[2]= 3;
      rollno[3]= 4;
      rollno[4]= 5;


      //int[] marks = new int[5];
      //int[] marks = {100,70,80,71,98};

        //method2
        int [] marks = new int[6]; //memory allocation
        marks[0]= 60;
        marks[1]= 70;
        marks[2]= 30;
        marks[3]= 50;
        marks[4]= 40;
        marks[5]= 80;
        marks[5]= 90;  //overwriting , will give an error
        System.out.println(marks[4]);
        System.out.println(marks[3]);
        System.out.println(marks[2]);
        System.out.println(marks[5]);
        System.out.println(marks[2]+marks[1]);

        //method3
        int [] numbers = {2,4,6,8,10};
        System.out.println(numbers[0]);
        System.out.println(numbers[4]);
        System.out.println(numbers[3]);

        String [] flowers = {"tulip","pansy","carnations","dafodils","gladiolus"};
        flowers[1]= "Dahlia"; //overwriting
        System.out.println(flowers[0]);
        System.out.println(flowers[1]);
        System.out.println(flowers[2]);
        System.out.println(flowers[3]);
        System.out.println(flowers[4]);

        //To check the length of an array we use .length
        System.out.println(flowers.length);


    }
}
