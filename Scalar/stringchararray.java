package com.Scalar;

public class stringchararray {
    public static void main(String[] args) {
        String st = "hello";
        char [] ar = {'h','e','l','l','o'};

        System.out.println(st);
        System.out.println(ar);

        //convert string to char array
        char[] stt = st.toCharArray();
        System.out.println(stt);

        //convert string to char array
        String stt1 = new String(ar);       //don't use to.string()
        System.out.println(stt1);




        /*
                                                   Strings vs Char arrays

        Strings                                                |           Character Arrays
                                                               |
        Sequence of chars represented as a single data type.   |      Sequential collection of char data type.
                                                               |
        Immutable                                              |      Mutable
                                                               |
        Offers several builtin methods.                        |      No builtin methods
                                                               |
        Stored in the String pool                              |      Stored in the Heap


         */

    }
}
