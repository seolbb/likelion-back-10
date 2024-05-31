package com.example.day07;

public interface Drawable {
    default public void draw(){
        System.out.println("도형을 그립니다.");
    }

    default public void test(){
        System.out.println("test입니다.");
    }
}
