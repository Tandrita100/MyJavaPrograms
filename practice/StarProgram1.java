package com.practice;

/*

   *
   **
   ***
   ****
   *****

 */

//public class StarProgram1 {
//    public static void main(String[] args){
//        int n=5;
//        for(int i=0; i<n;i++){
//            for(int j=0; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

/*

 *****
 ****
 ***
 **
 *

 */

public class StarProgram1 {
    public static void main(String[] args){
        int n=5;
        for(int i=5; i>0;i--){
            for(int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}