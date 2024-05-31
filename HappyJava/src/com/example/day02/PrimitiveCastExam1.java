package com.example.day02;

public class PrimitiveCastExam1 {

    public static void test(int i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        byte b = 10;
        int i = b;  //묵시적 형변환

        b =(byte)i;  //명시적 형변환

        float f = 10f;

        long l =(long) f;

        System.out.println(Float.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        test(b);
        test((int)l);

    }
}
