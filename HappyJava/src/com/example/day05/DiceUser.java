package com.example.day05;

public class DiceUser {
    //주사위를 n 번 굴려서 나오는 눈이 x 와 같은 횟수를 보여주세요.
    public static int diceGame(Dice dice, int totalCount, int eye){
        int count = 0;
        for(int i = 0; i < totalCount; i++){
            dice.roll();
            if(dice.eye == eye){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
     //주사위를 생성해서 주사위 게임을 진행한다.

     //주사위를 100 번 굴려서 나오는 눈이 3 와 같은 횟수를 보여주세요.
        Dice dice = new Dice();
//        dice.roll();
//        System.out.println(dice.eye);
        int totalCount = 500;
        int eye = 6;
        int count = diceGame(dice,100,3);
        System.out.println("주사위를 "+totalCount+"번 던져서 "+eye+"는 "+ count+"번 나왔습니다.");


    }
}
