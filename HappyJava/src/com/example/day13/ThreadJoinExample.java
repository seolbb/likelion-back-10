package com.example.day13;


class TaskThread extends Thread {
    private String taskName;

    public TaskThread(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println(taskName + " 작업 시작");
        try {
            Thread.sleep(2000);  // 2초 동안 스레드 일시 정지 (작업 시뮬레이션)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName + " 작업 완료");
    }
}

class DemonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("배경음악 재생중!!!");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadJoinExample {

    public static void main(String[] args) {
        TaskThread task1 = new TaskThread("작업 1");
        TaskThread task2 = new TaskThread("작업 2");

        DemonThread demonThread = new DemonThread();

        task1.start();
        task2.start();

        demonThread.setDaemon(true);
        demonThread.start();

        try {
            System.out.println("모든 작업의 완료를 기다립니다.");
            task1.join();  // task1의 완료를 기다림
            task2.join();  // task2의 완료를 기다림
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("모든 작업이 완료되었습니다.");
    }
}