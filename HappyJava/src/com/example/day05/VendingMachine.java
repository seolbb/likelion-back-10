package com.example.day05;

public class VendingMachine {
    public String pushProductButton(int menuId){
        if(menuId ==1)
            return "콜라";
        else if (menuId == 2) {
            return "사이다";
        }else if(menuId == 3){
            return "환타";
        }else{
            return "없어요ㅠㅠ";
        }
    }

    public static void printVersion(){
        System.out.println("자판기 v0.1");
    }
}
