package com.example.day07.interfaceExam;

public class Car implements Vehicle{
    private int speed;

    @Override
    public void accelerate(int speed) {
        this.speed += speed;
        if(this.speed > MAX_SPEED){
            this.speed = MAX_SPEED;
        }
        System.out.println("현재속도: "+this.speed + "km/h");
    }

    @Override
    public void decelerate(int speed) {
        this.speed -= speed;
        if(this.speed < 0){
            this.speed = 0;
        }
        System.out.println("현재속도: "+this.speed + "km/h");
    }
}
