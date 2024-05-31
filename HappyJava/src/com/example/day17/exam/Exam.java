package com.example.day17.exam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam {
    public static void main(String[] args) {
        //1. 숫자배열 처리
        int[] numbers = {3, 10, 4, 17, 6};
        int sum = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println(sum);

        //2. 문자열 리스트 필터링
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> filteredWords = words.stream()
                .filter(word -> word.length() >= 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredWords);


    }
}
