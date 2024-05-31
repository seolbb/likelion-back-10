package com.example.day05;

public class LottoMachine {
    private Ball[] lottoballs = new Ball[45];

    public LottoMachine(){
        //1-45까지의 숫자를 가진 볼을 로또머신에 넣어준다.
        for(int i = 0; i < lottoballs.length; i++){
            lottoballs[i] = new Ball(i+1);
        }
    }

    public void mix(){
        for(int i = 0; i < 100; i++) {
            int x = (int) (Math.random() * lottoballs.length);
            int y = (int) (Math.random() * lottoballs.length);
            Ball temp = lottoballs[x];
            lottoballs[x] = lottoballs[y];
            lottoballs[y] = temp;
        }
    }

    public Ball getBall(){
        Ball ball;
        int index;
        do{
            index = (int)(Math.random()*lottoballs.length)+1;
            ball = lottoballs[index];
        }while (ball == null);
        lottoballs[index] = null;
        return ball;
    }
}
