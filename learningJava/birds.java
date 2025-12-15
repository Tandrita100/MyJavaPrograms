package com.learningJava;

class crow{

    //method
    public void fly(){
        System.out.println("Crow is Flying");
    }

    //method overloading (fly)
    public void fly(int a){
        System.out.println("Flying with a parameter " + a);
    }

    //method overloading (fly)
    public void fly(int a, String b ){
        System.out.println("Flying with a parameter " + a + " and a string " + b);
    }

    //method
    public void walk(){
        System.out.println("Crow is walking");;
    }

    //method overloading (walk)
    public int walk(int i){
        return i;
    }

    //method overloading (walk)
    public String walk(String a){
        return a;
    }

    //method
    public void eat(){
        System.out.println("crow is eating");
    }

}

class Peacock extends crow{

    //method overriding from class crow
    public void fly(){
        System.out.println("Peacock is Flying");
    }

    //method overloading of above method fly in same(peacock) class
    public void fly(int a){
        System.out.println("Peacock is Flying with a parameter " + a);
    }

    //method overriding from crow class
    public void walk(){
        System.out.println("Peacock is walking");;
    }

    //method overriding from crow class
    public void eat(){
        System.out.println("Peacock is eating");
    }

}
public class birds {

    //method
    public void eat(){
        System.out.println("birds are eating");
    }

    //method overloading of above method eat in same(birds) class
    public void eat (crow cr){
        System.out.println("Crow is eating");
    }

    //method overloading of above method eat in same(birds) class
    public void eat (Peacock pc){
        System.out.println("Peacock is eating");
    }

    public static void main(String[] args){

        /*
        //methods of crow class
        crow c = new crow();
        c.fly();
        c.fly(2);
        c.fly(3,"crows");
        c.walk();
        System.out.println(c.walk(2));
        System.out.println(c.walk("legs"));

        System.out.println();

        //methods of Peacock class
        Peacock p = new Peacock();
        p.fly();
        p.fly(45, "wings");uy
        p.fly(500);
        p.walk();
        System.out.println(p.walk(8));
        System.out.println(p.walk("national bird"));
         */

        birds b = new birds();
        crow c = new crow();
        Peacock p = new Peacock();
        crow b1 = new Peacock();    //compiler checks the reference first and super/parent class can hold/refer the sub/child class but not vice versa.
        b.eat(c); //crow is eating
        b.eat(p); //peacock is eating
        b.eat(b1); //crow is eating

    }
}

/*

class Animal{
}

class Horse extends Animal{

}

public class TestClass {

	void eat(Animal abdfjbdhbf){
		System.out.println("Animal is eating");
	}

	void eat(Horse abbbbbb){
		System.out.println("Horse is eating");
	}

	public static void main(String[] args){
		TestClass tc = new TestClass();
		Animal a = new Animal();
		Animal b = new Horse();
		tc.eat(a);	// Animal is eating
		tc.eat(b);	// Horse is  eating
	}
}


VNMKMcWnzF5OR

// Horse Version
class Animal{
}

class Horse extends Animal{

}

public class TestClass {

	void eat(Animal abdfjbdhbf){
		System.out.println("Animal is eating");
	}

	public static void main(String[] args){
		TestClass tc = new TestClass();
		Horse b = new Horse();
		tc.eat(b);	// Horse is  eating
	}
}

 */


/*

public class TestMatch {

    public void run(Sachin s){
        System.out.println("Sachin is running");
    }

    public void run(Yuvraj y){
        System.out.println("Yuvraj is running");
    }

    public static void main(String[] args){
        Sachin s = new Sachin();
        Yuvraj y = new Yuvraj();
        Sachin s1 = new Yuvraj();
        TestMatch tm = new TestMatch();
        tm.run(s);
        tm.run(y);
        tm.run(s1);
    }

}

 */