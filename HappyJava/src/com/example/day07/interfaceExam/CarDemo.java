package com.example.day07.interfaceExam;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate(100);
        car.accelerate(30);
        car.decelerate(30);
        car.decelerate(40);
    }
}
