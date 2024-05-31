package com.example.day07.interfaceExam;

public class Cat implements Animal{
    @Override
    public void speak() {
        System.out.println("야옹");
    }

    @Override
    public void song() {
        System.out.println("고양이가 노래해요.. 야옹야옹");
    }
}
