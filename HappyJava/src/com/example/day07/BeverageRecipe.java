package com.example.day07;

public abstract class BeverageRecipe {

    // 템플릿 메소드
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew(); // 추상 메소드

    abstract void addCondiments(); // 추상 메소드

    public void boilWater() {
        System.out.println("물을 끓입니다.");
    }

    public void pourInCup() {
        System.out.println("컵에 따릅니다.");
    }
}
