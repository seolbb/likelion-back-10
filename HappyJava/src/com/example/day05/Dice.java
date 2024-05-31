package com.example.day05;

public class Dice {
//속성 - 주사위의 면을 나타내는 face  - 던졌을때 나오는 눈을 나타내는  eye
    public int face;
    public int eye;

    //생성자 -  객체가 처음 생성될 때 초기화 할 수있는 메서드
    //접근제한자 메소드명-클래스명과동일 (매개변수들..){ 구현 }
    public Dice(int face){
        this.face = face;
        System.out.println("Dice(int ) 생성자 실행!!");
    }

    public Dice(){
//        this.face = 6;
        this(6);
        System.out.println("Dice() 생성자 실행!!");
    }


    //행위 - 주사위를 굴리다.  roll
    public void roll(){
        //주사위를 굴렸을 때 어떤 일을 해야할지??
        eye = (int)(Math.random()*face) + 1;
    }
}
