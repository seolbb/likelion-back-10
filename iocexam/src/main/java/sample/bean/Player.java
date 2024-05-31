package sample.bean;

import org.springframework.stereotype.Component;

//@Component
public class Player {
    private String name;
    private Dice dice;   //실행될때 주사위를 인젝션 받아야한다.

    //DI 할 수 있는 방법은??
    //1. 생성자를 통한 주입
    //2. 설정자를 통한 주입(setter)
    //3. 필드를 통한 주입.


    public Player() {
        System.out.println("Player() 생성자 실행");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public void play(){
        System.out.println(name+"은 주사위를 던져서 "+dice.getNumber()+" 가 나왔습니다.");
    }
}
