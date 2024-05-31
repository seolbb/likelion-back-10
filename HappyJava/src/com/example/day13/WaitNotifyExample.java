package com.example.day13;

public class WaitNotifyExample {
    private static final Object lock = new Object();
    private static boolean itemAvailable = false;

    static class Producer extends Thread {
        public void run() {
            synchronized (lock) {
                System.out.println("생산자가 아이템을 생산 중입니다.");
                itemAvailable = true;
                lock.notify();  // 생산이 끝났으므로 소비자에게 알림
                System.out.println("생산자가 알림을 보냈습니다.");
            }
        }
    }

    static class Consumer extends Thread {
        public void run() {
            synchronized (lock) { // lock의 소유권을 가진다.
                while (!itemAvailable) {
                    try {
                        System.out.println("소비자가 아이템을 기다리고 있습니다.");
                        lock.wait();  // 아이템을 기다림, wait하면 lock의 소유권을 포기한다.
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("소비자가 아이템을 소비했습니다.");
                itemAvailable = false; // 아이템 소비 후 상태 업데이트
            }
        }
    }

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        consumer.start(); // 소비자 스레드 시작
        try {
            Thread.sleep(1000); // 생산자 시작 전에 잠시 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        producer.start(); // 생산자 스레드 시작
    }
}
