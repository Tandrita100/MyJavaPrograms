package com.JavaPrograms;

class one {
    int a;
    public int getA() {
        return a;
    }

    one(int a){
        this.a = a;
    }

//    one(int a){     ---> throws an error , we need to use this keyword
//        a = a;
//    }

    public int return1(){
    return 1;
    }
}
public class ThisSuper {
    public static void main(String[] args) {
       one ek = new one(100);
        System.out.println(ek.getA());
    }
}
