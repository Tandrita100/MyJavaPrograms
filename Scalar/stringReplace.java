package com.Scalar;

import java.util.Scanner;
public class stringReplace{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if(s.length()>0) {
            char firstchar = s.charAt(0);

            StringBuilder sb = new StringBuilder();
            sb.append(firstchar);
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == firstchar) {
                    sb.append('$');
                }else{
                    sb.append(s.charAt(i));
                }
            }

            System.out.println("Replaced String:" + sb);
        }

    }
}
