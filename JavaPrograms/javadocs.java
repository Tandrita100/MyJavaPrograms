package com.JavaPrograms;

/**
 * This is a simple documentation to show that HTML elements can be included in JavaDoc.
 * @version 1.0
 * @author Tandrita
 * @since 2010
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */

public class javadocs {

    /**
     * This method adds two numbers together.
     *
     * @param a The first number to add.
     * @param b The second number to add.
     * @return The sum of the two numbers.
     */
    public static int add(int a,int b){
        System.out.println("This method is used to add 2 numbers.");
        return a+b;
    }

    /**
     * This method multiplies two numbers together.
     *
     * @param a The first number to multiply.
     * @param b The second number to multiply.
     * @return The product of the two numbers.
     */
    public  static int multiply(int a,int b){
        System.out.println("This method is used to multiply 2 numbers.");
        return a+b;
    }

    /**
     * This method divides two numbers.
     *
     * @param a The dividend.
     * @param b The divisor.
     * @return The quotient of the two numbers.
     */
    public  static int divide(int a,int b){
        System.out.println("This method is used to divide 2 numbers.");
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println(add(465,988));
        System.out.println(multiply(67,745));
        System.out.println(divide(673,45));
    }
}
