package com.example.day07;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("원을 그립니다.");
    }

    @Override
    public void test() {
        System.out.println("Circle의 test입니다.");
    }
}
