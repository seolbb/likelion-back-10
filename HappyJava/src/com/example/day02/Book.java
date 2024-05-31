package com.example.day02;

public class Book {
    private String title;
     static int price;

    //메소드
    //접근제한자 리턴타입 메소드명(매개변수들... ){  구현  }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
