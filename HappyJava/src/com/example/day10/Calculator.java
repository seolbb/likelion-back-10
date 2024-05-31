package com.example.day10;

public class Calculator<T extends Number> {

    private T number;

    public Calculator(T number) {
        this.number = number;
    }

    public double square() {
        return number.doubleValue() * number.doubleValue();
    }

    public static void main(String[] args) {
        Calculator<Integer> intCalculator = new Calculator<>(5);
        Calculator<Double> doubleCalculator = new Calculator<>(5.5);

//        Calculator<String> stringCalculator = new Calculator<String>("abc");

        System.out.println("Integer square: " + intCalculator.square());
        System.out.println("Double square: " + doubleCalculator.square());
    }

}