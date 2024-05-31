package com.example.day16.exam;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//주어진 List<String>에서 글자 수가 5 이상인 첫 번째 단어를 찾아 출력하라.
// for 루프와 람다식을 활용하여 조건에 맞는 요소를 찾아보세요.
public class LambdaFindElement {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Fig");
        // 람다식을 사용하여 조건 검사
        Predicate<String> condition = s -> s.length() >= 5;

        for (String word : words) {
            if (condition.test(word)) {
                System.out.println("첫 번째 길이가 5 이상인 단어: " + word);
                break; // 첫 번째 매칭되는 요소를 찾으면 중단
            }
        }
    }
}