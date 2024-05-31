package com.example.day05;

public class Test {
    public static void main(String[] args) {
        VendingMachine.printVersion();//클래스메서드

        VendingMachine vendingMachine = new VendingMachine();
        String product = vendingMachine.pushProductButton(2);//인스턴스메서드
        System.out.println(product);

        double value = Math.random();
        System.out.println(value);

        System.out.println(ClassA.fieldA); //클래스필드
        ClassA a = new ClassA();
        System.out.println(a.fieldB); //인스턴스 필드
    }
}
