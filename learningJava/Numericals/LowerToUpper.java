package com.learningJava.Numericals;

public class LowerToUpper {

    public static void main(String[] args){
        String s = "TandRiTa";
        char [] charArr = s.toCharArray();
        int n = charArr.length;
        for(int i=0; i<n; i++){
            if(charArr[i] >= 'A' && charArr[i] <= 'Z'){
                charArr[i] = (char) (charArr[i]+32);
            } else if (charArr[i] >= 'a' && charArr[i] <= 'z') {
                charArr[i] = (char) (charArr[i]-32);
            }
        }
        s = new String(charArr);
        System.out.println(s);
    }
}
