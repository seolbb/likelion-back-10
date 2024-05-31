package com.example.day16;

public class MyFunctionalInterface3Test {
    public static void main(String[] args) {

        MyFunctionalInterface3 myFunctionalInterface3;

        myFunctionalInterface3 = new MyFunctionalInterface3() {
            @Override
            public int method1(int x, int y) {
                return x + y;
            }
        };

        myFunctionalInterface3.method1(1, 2);

        myFunctionalInterface3 = (x, y) -> {
            return x + y;
        };

        myFunctionalInterface3 = (x, y) -> x + y;

        myFunctionalInterface3 = (x, y) -> sum(x, y);

        myFunctionalInterface3.method1(3, 5);

    }

    public static int sum(int x, int y) {
        return x + y;
    }
}