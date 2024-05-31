package com.example.day04;

public class CalTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int resultValue = cal.plus(1,2,3,4,5,6,7,8);
        System.out.println(resultValue);
        System.out.println(cal.plus(1));
        System.out.println(cal.plus(1,2,4,5));
    }
}
