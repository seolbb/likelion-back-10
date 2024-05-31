package com.example.day13;

//공유객체
public class Robot {
    public synchronized void methodA() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("method A : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void methodB() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("method B :" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void methodC() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("method C : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

