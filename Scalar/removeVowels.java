package com.Scalar;

public class removeVowels {
    public static void main(String[] args) {
        String st = "Thisisastring.";
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);

            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                continue;
            }

            System.out.print(ch);
        }
    }
}
