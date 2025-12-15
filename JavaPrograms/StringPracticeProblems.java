package com.JavaPrograms;

public class StringPracticeProblems {
    public static void main(String[] args) {

       //Question1
        String fruit = "WATERMELON";
        String lc = fruit.toLowerCase();
        System.out.println(lc);

        //Question2
        String animal = "   cat   ";
        String replace = animal.replace(" ", "_").toUpperCase();
        System.out.println(replace);

        //Question3
        String letter = "Dear <|name|>, Thanks a lot";
        String replace1 = letter.replace("<|name|>", "George");
        System.out.println(replace1);

        //Question4
        String sentence = "This is a sentence with so  many   spaces";
        System.out.println(sentence.indexOf("  "));
        System.out.println(sentence.indexOf("   "));

        //Question5
        String Letter ="Dear Harry, \nThis Java Course is nice. \nThanks";
        System.out.println(Letter);

        //1
        String name = "tandrita  baidya";
        System.out.println(name);
        String capital = name.substring(0,1).toUpperCase()+ name.substring(1);
        System.out.println(capital);

        //2
        String TestCode1 = "Hello <|name|>,your age is <|age|>, Welcome Back!";
        TestCode1 = TestCode1.replace("<|name|>","tony");
        TestCode1 = TestCode1.replace("<|age|>","34");
        System.out.println(TestCode1);

        String TestCode2 = TestCode1.replace("<|name|>", "tony").replace("<|age|>","34");
        System.out.println(TestCode1);

    }
}
