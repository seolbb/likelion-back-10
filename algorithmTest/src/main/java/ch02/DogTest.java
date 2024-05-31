package ch02;

public class DogTest {
    public static void main(String[] args) {
        Dog myDog = null;

//        int i ;
//        char c;
//        String str;

        myDog = new Dog(); //인스턴스화

        myDog.breed = "말티즈";
        myDog.age = 10;
        myDog.color = "흰색";

        myDog.bark();

        myDog.displayInfo();

        Dog myDog2 = new Dog("푸들","갈색");
        myDog2.age = 8;

        myDog2.displayInfo();

        Dog myDog3 = new Dog("진돗개",9,"노랑색");
        myDog3.displayInfo();

//        Dog myDog4 = new Dog("요크셔테리어");

    }
}
