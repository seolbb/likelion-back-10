package com.example.day06;

public class Car {
    String name;
    int speed;
    
//    public Car(){
//        System.out.println("car() 생성자 호출");
//    }

    public Car(String name){
        this.name = name;
//        this(0, name);
        System.out.println("car(String name) 생성자 호출");
    }
    public Car(int speed, String name){
        this.name = name;
        this.speed = speed;
        System.out.println("car(int speed, String name) 생성자 호출");
    }

    public Car(int speed){
//        this(speed,"");
        this.speed = speed;
        System.out.println("car(int speed) 생성자 호출");
    }
}
