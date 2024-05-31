package com.example.day09;

public class StaticExam {
    int i = 10;
    static int si = 20;

    public void m1(){
        System.out.println(i);
        System.out.println(si);
        sm();
    }
    public static void sm(){
//        System.out.println(i); //불가능
        System.out.println(si);
//        m1();   불가능.
    }
}
