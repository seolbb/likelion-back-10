package com.example.day06;

public class Test7 {
    public static void main(String[] args) {
        Object obj = new Child();

        if(obj instanceof  Child){
            System.out.println("obj instanceof  Child");
        }

        if(obj instanceof Parent){
            System.out.println("obj instanceof Parent");
        }

        if(obj instanceof  Object){
            System.out.println("obj instanceof  Object");
        }
    }
}
