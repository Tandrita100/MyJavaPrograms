package com.Scalar;

public class varArgs {
    static float getavg(float ...num){
        float total = 0;
        for (float element:num) {
            total += element;
        }
        return total/num.length;
    }
    public static void main(String[] args) {
        float average1 = getavg(1,3,6,7,8);
        float average2 = getavg(1,3,61,7,8,500);
        float average3 = getavg(1000,7,8);
        System.out.println(average1);
        System.out.println(average2);
        System.out.println(average3);
    }
}
