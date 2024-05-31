package com.example.day13;

public class JoinExam {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();  //계산해주세요.

        try {
            sumThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("SumThread에서 계산한 결과는 :   입니다.");
    }
}

class SumThread extends Thread {

    @Override
    public void run() {
        //계산을 하는 일을 담당하는 쓰레드.
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("계산종료!!");
    }
}
