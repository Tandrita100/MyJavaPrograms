package com.PracticePrograms;

class Tree{
    Tree grow(){
        System.out.println("I am a tree.");
        return this;
    }
}
class MangoTree extends Tree{
    MangoTree grow(){
        System.out.println("I am a Mango Tree.");
        return this;
    }
}
public class CovariantReturnTypeExample {
    public static void main(String [] args){
          Tree t = new Tree();
          t.grow();
          MangoTree mt = new MangoTree();
          mt.grow();
          Tree t1 = new MangoTree();
          t1.grow();
    }
}
