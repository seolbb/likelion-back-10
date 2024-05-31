package com.example.day04;

public class Calculator {
    //접근제한자 리턴타입 메소드명 (매개변수들..) {}

    public int plus(int i , int j){
        return i+j;
    }

    public int plus(int i, int j, int x){
        return  i+j+x;
    }

    public int plus(int... vals){
        int sum = 0;
        for(int v : vals){
            sum += v;
        }
        return  sum;
    }
}
