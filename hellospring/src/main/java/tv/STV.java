package tv;

public class STV implements TV{
    //기능 끄다 켜다
    @Override
    public void turnOn() {
        System.out.println("STV의 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("STV의 전원을 끕니다.");
    }

    public void soundUp(){
        System.out.println("STV의 소리를 높입니다..");
    }
    public void soundDown(){
        System.out.println("STV의 소리를 낮춥니다.");
    }
}
