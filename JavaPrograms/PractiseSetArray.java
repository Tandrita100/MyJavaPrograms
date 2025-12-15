package com.JavaPrograms;

public class PractiseSetArray {
    public static void main(String[] args) {

        //Question1
        float[] num = {2.2f,3.4f,5.6f,7.8f,5.3f};
        for(float elements:num){                    //this will display the numbers 1 by 1
            System.out.println(elements);
        }
        float sum = num[0]+num[1]+num[2]+num[3]+num[4];                //this will add the numbers together
        System.out.println("The sum of these numbers are:"+ sum);      //this will print the total sum

        //another method (using for each loop)
        float sum1 = 0;
        for(float element:num){
            System.out.println(element);
            sum1 = sum1 + element;           //this will add the numbers 1 by 1.
           // System.out.println(sum1);
        }
        System.out.println("The sum of these numbers are:"+ sum1);



        //Question2
        float[] num1 = {2.2f,3.4f,5.6f,7.8f,5.3f};
        float value = 5.3f;
        boolean ispresent = false ;
        for(float element:num1) {
            if (value == element) {
                ispresent = true;
                break;
            }
        }
        if(true) {
            System.out.println("It is present");
        }
        else{
            System.out.println("It is not present");
        }


        //Question3
        float[] num2 = {2.2f,3.4f,5.6f,7.8f,5.3f};
        float sum2 = 0;
        for(float element:num){
            System.out.println(element);
            sum2 = sum2 + element;           //this will add the numbers 1 by 1.
            // System.out.println(sum1);
        }
        System.out.println("The sum of these numbers are:"+ sum2);
        System.out.println("The value of average marks is " + sum2/num2.length);

    }
}
