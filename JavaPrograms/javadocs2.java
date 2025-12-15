package com.JavaPrograms;

/**
 * this is a description for java docs 2.
 */
public class javadocs2 {
    /**
     * this is a description
     * @param args this is main method.
     */
    public static void main(String[] args) {
        System.out.println("This is a main method." );

    }

    /**
     * this is a method.
     * @param a is 1st no. to add.
     * @param b is 2nd no. to add.
     * @return the sum of a and b.
     * @throws Exception if a = 0.
     * @deprecated this method is deprecated.
     */
    public int add(int a,int b) throws Exception{
        if(a==0){
            throw new Exception();
        }
        return a + b;
    }
}
