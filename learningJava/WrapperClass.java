package com.learningJava;

public class WrapperClass {

    static void test(String a){
        System.out.println(a);
        int b = Integer.valueOf(a)+123;
        System.out.println(b);
    }
    public static void main(String[] args){
           test("Hii");

    }
}




/*
import java.util.*;
class CollectionTest{

	public static void main(String[] args){
		List l = new LinkedList();
		ArrayList al = new ArrayList();
		l.add(1);
		System.out.println(l.toString());
		System.out.println(al.toString());
		int[] a = new int[4];
		a[0]=1;
		int[] b = new int[]{1,2,3,4};
		int[] c = {1234,344};

		System.out.println(a[0]);
		System.out.println(b[0]);
		System.out.println(c[0]);

		Set s = new HashSet();
		s.add(11);

	}
}
 */