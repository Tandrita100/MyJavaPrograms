package com.JavaPrograms;

//annotation2
@FunctionalInterface
interface huh{
    public int hahahaha();
    //public int hahahaha();
}
class newclass implements animal{
    //annotation1
    @Override
    public void eat() {
        System.out.println("eat......");
    }

    @Override
    public void sleep() {
        System.out.println("sleep.....");
    }

    //annotation3
    @Deprecated
    public void hehe(){
        System.out.println("hahahhahhahahhhahahhhahhhha");
    }
}
public class AnnotationsInJava {
    //annotation4
    @SuppressWarnings("deprication")
    public static void main(String[] args) {
        newclass n = new newclass();
        n.eat();
        n.sleep();
        n.hehe();
    }
}
