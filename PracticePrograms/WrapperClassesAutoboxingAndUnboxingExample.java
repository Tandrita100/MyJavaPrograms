package com.PracticePrograms;

public class WrapperClassesAutoboxingAndUnboxingExample {
    public static void main(String [] args){

//        Primitive Type	Wrapper Class
//        byte	            Byte
//        short         	Short
//        int	            Integer
//        long	            Long
//        float	            Float
//        double	        Double
//        char	            Character
//        boolean	        Boolean

        int num = 34;
        System.out.println("primitive : " + num);
        Integer num1 = num; // autoboxing       rdes8760-/fghjkl
        System.out.println("Wrapped : " + num1);
        int num2 = num1; // unboxing
        System.out.println("Unwrapped : " + num2);

        // using wrapper methods
        String s = "123";
        System.out.println("string : " + s);
        int parsedNum = Integer.parseInt(s);
        System.out.println("Parsed String : " + parsedNum);
    }
}
