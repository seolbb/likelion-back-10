package com.example.day09;

public class StaticOuterClass {
    private static int outerField = 10;

    public static void outerMethod(){
        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }

    static class InnerClass{
        public void innerMethod(){
            System.out.println("outerField = " + outerField);
        }
    }

    public static void main(String[] args) {
        StaticOuterClass.outerMethod();

        StaticOuterClass.InnerClass inner = new StaticOuterClass.InnerClass();
        inner.innerMethod();
    }
}
