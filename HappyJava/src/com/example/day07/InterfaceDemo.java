package com.example.day07;

public class InterfaceDemo {
    public static void main(String[] args) {
        //인터페이스도 타입이다.
        Ainter ainter = new DImpl();
        CInter cInter = new DImpl();

        //자기가 정의한 것만 사용 가능.
        ainter.aMethod();
        cInter.cMethod();

        Binter binter = new DImpl();
        Dinter dinter = new DImpl();

        binter.bMehod();
        binter.aMethod();
        binter.same();


        Ainter a = new AImpl();
        ((AImpl)a).say();  // 타입이 아는 것 까지만 쓸 수 있고, 외에것을 쓰고 싶다면 형변환이 필요!!

        System.out.println(Ainter.I);
        System.out.println(Binter.i);
        System.out.println(CInter.i);
    }
}
