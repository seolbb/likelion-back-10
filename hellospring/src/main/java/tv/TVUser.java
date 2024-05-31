package tv;

public class TVUser {
    public static void main(String[] args) {
//        STV tv = new STV();
//        tv.powerOn();
//        tv.soundUp();
//        tv.soundDown();
//        tv.powerOff();

//        LTV tv = new LTV();
//        tv.turnOn();
//        tv.volumeUp();
//        tv.volumeDown();
//        tv.turnOff();

//        TV tv = new LTV();
        TV tv = TVFactory.getTV(args[0]);

        tv.turnOn();
        tv.soundUp();
        tv.soundDown();
        tv.turnOff();
    }
}
