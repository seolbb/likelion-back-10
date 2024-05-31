package com.example.day04;

public class ItemForArray {
    private int price;  //속성, 필드
    private String name;

    public ItemForArray(int price, String name){
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
