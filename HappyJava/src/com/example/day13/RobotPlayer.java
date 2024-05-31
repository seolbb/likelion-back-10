package com.example.day13;

public class RobotPlayer extends Thread {
    private String name;
    private Robot robot;

    public RobotPlayer(String name, Robot robot) {
        this.name = name;
        this.robot = robot;
    }

    public void run() {
        if (name.equals("A")) {
            robot.methodA();
        } else if (name.equals("B")) {
            robot.methodB();
        } else {
            robot.methodC();
        }
    }
}