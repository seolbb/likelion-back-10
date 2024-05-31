package com.example.day13;

public class RobotMain {
    public static void main(String[] args) {
        Robot robot = new Robot();
        RobotPlayer playerA = new RobotPlayer("A", robot);
        RobotPlayer playerB = new RobotPlayer("B", robot);
        RobotPlayer playerC = new RobotPlayer("C", robot);

        playerA.start();
        playerB.start();
        playerC.start();
//        playerA.start();  Thread객체 하나를 2번 start() 는 할 수 없어요...
//        //한 스레드는 두번 시작할 수 없어요..

    }
}
