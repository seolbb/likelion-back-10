package com.example.day16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // 기존 방식: 익명 클래스를 사용하여 Comparator 구현
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        // 출력: [Alice, Bob, Charlie]
        System.out.println("Sorted with anonymous class: " + names);

        // 람다식을 사용하여 Comparator 구현
        names.sort((s1, s2) -> s1.compareTo(s2));

        // 출력: [Alice, Bob, Charlie]
        System.out.println("Sorted with lambda expression: " + names);
    }
}