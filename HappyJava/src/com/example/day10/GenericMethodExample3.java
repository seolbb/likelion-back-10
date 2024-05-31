package com.example.day10;

import java.util.List;

public class GenericMethodExample3 {

    // 제네릭 메소드 정의
    public static <T> void printFirst(List<? extends T> list) {
        if (!list.isEmpty()) {
            T item = list.get(0);  // 첫 번째 요소를 가져옴
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // Integer 리스트
        List<Integer> integerList = List.of(1, 2, 3);
        printFirst(integerList); // 1 출력

        // String 리스트
        List<String> stringList = List.of("Hello", "World");
        printFirst(stringList); // "Hello" 출력
    }

}