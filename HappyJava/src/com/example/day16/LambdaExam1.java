package com.example.day16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExam1 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry");

        Consumer<String> rambdaTest = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        items.forEach(item -> System.out.println(item));

        items.forEach(rambdaTest);

        items.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread start111!!");
            }
        }).start();

        new Thread(() -> System.out.println("Thread start222!!")).start();

    }

}
