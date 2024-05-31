package com.example.day13;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("myThread 출발");
        //쓰레드가 해야하는 일
        for (int i = 0; i < 100; i++) {
            System.out.println("myThread 안녕!!!");
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("MyThread종료!!!");
    }  //상속..  Thread 를 상속받은 MyThread 는 Thread 이다.

}

class CaramiThread extends Thread {
    @Override
    public void run() {
        System.out.println("CaramiThread 출발");
        //쓰레드가 해야하는 일
        for (int i = 0; i < 100; i++) {
            System.out.println("CaramiThread 안녕!!!");
        }
        System.out.println("CaramiThread!!!");
    }  //상속..  Thread 를 상속받은 MyThread 는 Thread 이다.

}

public class ThreadExam {
    public static void main(String[] args) {
        System.out.println("main출발!!");

        //쓰레드 생성.
        MyThread myThread = new MyThread();
        myThread.start();  //약속!!

        CaramiThread caramiThread = new CaramiThread();
        caramiThread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main 안녕!!!");
        }

        System.out.println("main 종료!!");
    }
}
