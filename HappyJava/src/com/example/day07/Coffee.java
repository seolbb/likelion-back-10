package com.example.day07;

public class Coffee extends BeverageRecipe{

    @Override
    void brew() {
        System.out.println("커피를 에스프레소로 내립니다.");
    }

    @Override
    void addCondiments() {
        System.out.println("우유를 추가합니다.");
    }
}
