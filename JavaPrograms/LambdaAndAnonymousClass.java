package com.JavaPrograms;

@FunctionalInterface
interface methodsofclass{
     void meth1(int a);
   // void meth2();
}

//we can also do this by using lambda expression. we don't need to create a class for it

//class anotherclass implements  methodsofclass{
////    "@Override
////    public void meth1() {
////        System.out.println("buga buga buga buga");
////    }"
//
//    @Override
//    public void meth1(int a) {
//        System.out.println(a);
//    }
//}


//we don"t need to do this if we want use as a one time using anonymous class.
//class anony implements methodsofclass{
//    public void display(){
//        System.out.println("hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("this is meth 1.");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("this is meth 2.");
//    }
//}
public class LambdaAndAnonymousClass {
    public static void main(String[] args) {
        // we can also do this without making class and interface.
//        anony ano = new anony();
        //  methodsofclass ano = new anony();
        //  ano.meth1();
        //  ano.display();

        //we can create anonymous class.
//        methodsofclass meth = new methodsofclass() {      //if we write this the methods below will generate automatically.
//            @Override
//            public void meth1() {
//                System.out.println("i am meth1.");
//            }

//            @Override
//            public void meth2() {
//                System.out.println("i am meth2.");
//            }
  //      };  // ; is important

       // meth.meth1();


        //we can also do this by using lambda expressions.
//        methodsofclass me = new anotherclass();
//        me.meth1();

        //lambda expression ()->
        methodsofclass ma= (a)->{
            System.out.println("i am using lambda exp..." + a);
        }; //; is imp

       ma.meth1(3);
    }

}

