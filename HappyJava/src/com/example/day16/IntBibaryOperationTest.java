package com.example.day16;

class Sum implements IntBinaryOperation {

    @Override
    public int apply(int a, int b) {
        return a + b;
    }
}

public class IntBibaryOperationTest {
    public static void main(String[] args) {
        IntBinaryOperation test = new IntBinaryOperation() {
            @Override
            public int apply(int a, int b) {
                return 0;
            }
        };

        IntBinaryOperation test2 = (a, b) -> 0;

        IntBinaryOperation add = (a, b) -> a + b;
        IntBinaryOperation minus = (a, b) -> a - b;
        IntBinaryOperation divide = (a, b) -> a / b;


        System.out.println(test.apply(1, 2));
        System.out.println(add.apply(3, 4));
        System.out.println(minus.apply(4, 2));
        System.out.println(divide.apply(5, 2));

        IntBinaryOperation sum = new Sum();
        System.out.println(sum.apply(5, 2));


    }
}
