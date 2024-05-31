package com.example.day05;

public class ClassTest {
    public void print(ClassB b){

        System.out.println(b.name);
        System.out.println(b.flag);
        System.out.println(b.address);
//        System.out.println(b.age);
    }

    public static void main(String[] args) {
        ClassTest test = new ClassTest();
        test.print(new ClassB());


    }
}
