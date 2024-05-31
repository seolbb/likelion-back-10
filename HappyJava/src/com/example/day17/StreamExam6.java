package com.example.day17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// forEach 사용 예시
        numbers.stream()
                .forEach(n -> System.out.println("Number: " + n));

// peek 사용 예시
        List<Integer> doubledNumbers = numbers.stream()
                .peek(n -> System.out.println("Processing 1: " + n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("Processing 2: " + n))
                .collect(Collectors.toList());
    }
}
