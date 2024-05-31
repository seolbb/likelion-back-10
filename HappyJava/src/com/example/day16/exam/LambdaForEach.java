package com.example.day16.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//주어진 List<Integer>의 각 요소에 10을 더한 결과를 새 리스트에 저장하고 출력하라.
// 람다식을 사용하여 List의 forEach() 메서드를 활용하라.
public class LambdaForEach {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> modifiedNumbers = new ArrayList<>();

        // 람다식을 사용하여 각 요소에 10을 더하고 새 리스트에 저장하라
        numbers.forEach(n -> modifiedNumbers.add(n + 10));

        // 수정된 리스트 출력
        System.out.println(modifiedNumbers);
    }
}
