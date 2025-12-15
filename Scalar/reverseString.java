package com.Scalar;

public class reverseString {
    public static void main(String[] args) {
        String name = "tandrita";
        String reverse = "";
        for(int i=name.length()-1;i>=0;i--){
            reverse += name.charAt(i);
        }
        System.out.println(reverse);
    }
}

/*   using a method
 static void reversestring(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String name = sc.next();
        String reverse = "";
        for(int i=name.length()-1;i>=0;i--){
            reverse += name.charAt(i);
        }System.out.println(reverse);
    }
    public static void main(String[] args) {
    reversestring();
 */