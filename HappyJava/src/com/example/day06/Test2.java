package com.example.day06;

public class Test2 {
    public static void main(String[] args) {
        //아무것도 상속받지 않으면 Object를 상속받는다.
        Parent p = new Parent();

//           Class c =  p.getClass();
//           c.getName();
        System.out.println(p.getClass().getName());
    }
}
