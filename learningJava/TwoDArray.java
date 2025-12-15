package com.learningJava;

public class TwoDArray {
    public static void main(String[] args){
        int[][] array = new int[][]{{1,4,6},{46,89,7},{36,454,67},{27,47,45}};

        int [] smallArray = array[0];
        System.out.println(smallArray[0]);
        System.out.println(smallArray[1]);
        System.out.println(smallArray[2]);

        int [] smallArray1 = array[1];
        System.out.println(smallArray1[0]);
        System.out.println(smallArray1[1]);
        System.out.println(smallArray1[2]);

        int [] smallArray2 = array[2];
        System.out.println(smallArray2[0]);
        System.out.println(smallArray2[1]);
        System.out.println(smallArray2[2]);

        int [] smallArray3 = array[3];
        System.out.println(smallArray3[0]);
        System.out.println(smallArray3[1]);
        System.out.println(smallArray3[2]);

    }
}
