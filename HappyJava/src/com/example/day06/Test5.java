package com.example.day06;

public class Test5 {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.i);
        System.out.println(p.getI());

        Child c = new Child();
        System.out.println(c.i);
        System.out.println(c.getI());
        //1. 부모(조상)는 자식(자손)을 가리킬 수(타입이 될 수) 있다.
        //2. 필드는 오버라이드되면 타입을 따른다.
        //3. 메소드는 오버라이딩되면 무조건!!!!   자식을 따른다..  (다형성)
        Parent pc = new Child();

        System.out.println(pc.i);
        System.out.println(pc.getI());

        Child ccc = new Child();
        System.out.println(ccc.i);
    }
}
