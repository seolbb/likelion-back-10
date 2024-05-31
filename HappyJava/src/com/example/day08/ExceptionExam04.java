package com.example.day08;

public class ExceptionExam04 {
    public static void 심부름(){
        //예외를 직접
        System.out.println("심부름 시작!!");

        int i = 0;
        try {
            System.out.println(10 / i);
        }catch (Exception e){
            System.out.println("다른마트 감");
        }

        System.out.println("심부름 끝");
    }

    public static void main(String[] args) {
        //엄마가 심부름 시킴.
        심부름();
    }
}
