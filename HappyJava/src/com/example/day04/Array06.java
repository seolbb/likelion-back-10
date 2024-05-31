package com.example.day04;

public class Array06 {
    public static void main(String[] a) {
        //배열의 길이
        int[] iarr = new int[5];

        System.out.println(iarr.length);

        for(int i = 0; i < iarr.length;i++){
            iarr[i] = i + 1;
        }

        for(int i =0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
//javac Hello.java
//java Hello 10,20,30