package tv;

public class LTV implements TV{
    public void turnOn(){
        System.out.println("LTV의 전원을 켭니다.");
    }
    public void turnOff(){
        System.out.println("LTV의 전원을 끕니다.");
    }

    @Override
    public void soundUp() {
        System.out.println("LTV의 소리를 높입니다..");
    }

    @Override
    public void soundDown() {
        System.out.println("LTV의 소리를 낮춥니다.");
    }

}
