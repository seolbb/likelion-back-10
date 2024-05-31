package com.example.day07.interfaceExam;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.speak();
        cat.speak();

//        String str = cat.speak();

        dog.song();
        cat.song();

        System.out.println(Animal.AGE);
    }
}
