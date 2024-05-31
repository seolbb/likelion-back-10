package com.example.day10;

import java.util.List;
import java.util.Arrays;

public class WildcardExample {
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static <T> void printList2(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<String> stringList = Arrays.asList("Hello", "World");
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);

        printList(intList);    // 출력: 1, 2, 3
        printList(stringList); // 출력: Hello, World
        printList(doubleList); // 출력: 1.1, 2.2, 3.3

        printList2(intList);    // 출력: 1, 2, 3
        printList2(stringList); // 출력: Hello, World
        printList2(doubleList); // 출력: 1.1, 2.2, 3.3
    }

}