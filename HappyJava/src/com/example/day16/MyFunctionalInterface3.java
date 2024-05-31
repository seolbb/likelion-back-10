package com.example.day16;

@FunctionalInterface
public interface MyFunctionalInterface3 {
    public int method1(int x, int y);

    default public void m() {
    }

    ;
}