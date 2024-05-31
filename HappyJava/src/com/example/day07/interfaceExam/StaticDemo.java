package com.example.day07.interfaceExam;

import java.util.concurrent.Callable;

public class StaticDemo {
    public static void main(String[] args) {
        Calculator.light();
        int value = Calculator.add(1,3);
        System.out.println(value);
    }
}
