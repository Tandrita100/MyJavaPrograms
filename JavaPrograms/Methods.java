package com.JavaPrograms;

public class Methods {
    //Static float cal(float x, float y)
//    float cal(float x, float y){
//        float z;
//        if(x>y){
//            z = x/y;
//        }
//        else {
//            z = x*y;
//        }
//        return z;
//    }

    static int add(int x,int y){
        int z;
        z = (x*y)/2-(x+y);
        return z;
    }

    public static void main(String[] args) {

//        float a = 4.2f;
//        float b = 6.0f;
//        float c;
//        c = cal(a,b);
//        System.out.println(c);
//
//        float d = 14.0f;
//        float e = 7.0f;
//        float f;
//        f = cal(d,e);
//        System.out.println(f);

        //we can also call a function without using static method that is by creating an object.
//        float a = 4.2f;
//        float b = 6.0f;
//        Methods obj = new Methods();
//        float c;
//        c = obj.cal(a,b);
//        System.out.println(c);
//
//        float d = 14.0f;
//        float e = 7.0f;
//        float f;
//        f = obj.cal(d,e);
//        System.out.println(f);
//
//        float g = 7.8f;
//        float h = 9.2f;
//        float i;
//        i = obj.cal(g,h);
//        System.out.println(i);

        int a = 24;
        int b = 14;
        int c = add(a,b) ;
        System.out.println(c);

        int d = 56;
        int e = 34;
        

    }
}
