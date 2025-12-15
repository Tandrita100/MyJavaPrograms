package com.Scalar;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I like movies,");
        sb.append(" and music.");
        System.out.println(sb);

        System.out.println(sb.insert(13, " food"));
        System.out.println(sb.replace(2,6, "love"));
        System.out.println(sb.delete(6,13));
        System.out.println(sb);

        //converting string builder to string
        String str = sb.toString();
        System.out.println(str);
    }
}
