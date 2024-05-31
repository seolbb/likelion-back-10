package com.example.day13;

public class ThreadInterruptExample {
    static class MyThread extends Thread {
        public void run() {
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(1000);  // 1초 동안 일시 정지
                    System.out.println("Processing step " + (i + 1));
                }
            } catch (InterruptedException e) {
                System.out.println("스레드가 중단되었습니다.");
                return;  // 스레드를 안전하게 종료
            }
        }
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();  // 스레드 시작

        try {
            Thread.sleep(2500);  // 메인 스레드를 2.5초 동안 일시 정지
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.interrupt();  // 스레드에 인터럽트 신호 보내기
    }
}

