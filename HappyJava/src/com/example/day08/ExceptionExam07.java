package com.example.day08;

import java.util.Scanner;

public class ExceptionExam07 {
    //학생의 점수를 입력 받는 메서드
    public void inputScore(int score) throws MyException{

        if(score < 1 || score > 5){
//            System.out.println("점수는 0-100 사이만 입력할 수 있습니다.");
//            return;
            throw new MyException("1-5점까지만 입력 가능합니다. 당신이 입력한 점수는 : "+score);
        }

        System.out.println(score);
    }

    public static void main(String[] args) {
        ExceptionExam07 exceptionExam07 = new ExceptionExam07();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        try {
            exceptionExam07.inputScore(keyboard.nextInt());
        }catch (MyException e){
            //catch 블럭에서 아무일도 하지 않는것이 가장 나쁜 예외 처리..
            System.out.println(e.getMessage());
        }

        System.out.println("main 종료!!");
    }
}
