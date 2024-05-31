package com.example.day06;

public class Test1 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.i);
        System.out.println(parent.getI());

        Child child = new Child();
        System.out.println(child.i);
        System.out.println(child.getI());
        System.out.println(child.getClass().getName());
    }
}
