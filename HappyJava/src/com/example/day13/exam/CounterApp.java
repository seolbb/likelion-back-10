package com.example.day13.exam;

public class CounterApp {
    public static void main(String[] args) {
        Thread incrementThread = new Thread(new IncrementCounter());
        Thread decrementThread = new Thread(new DecrementCounter());

        incrementThread.start();
        decrementThread.start();
    }
}

class IncrementCounter implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Increment: " + i);
            try {
                Thread.sleep((int) (Math.random() * 10));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class DecrementCounter implements Runnable {
    public void run() {
        for (int i = 100; i > 0; i--) {
            System.out.println("Decrement: " + i);
            try {
                Thread.sleep((int) (Math.random() * 10));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
