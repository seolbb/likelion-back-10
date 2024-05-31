package com.example.day16.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//주어진 `List<Integer>`의 각 요소를 제곱한 결과를 새 리스트에 저장하고 출력하라.
// `for` 루프와 람다식을 활용하여 각 요소를 변환하라.
public class LambdaTransformList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = new ArrayList<>();
        // 람다식을 사용하여 각 요소를 변환
        Function<Integer, Integer> squareFunction = n -> n * n;

        for (Integer number : numbers) {
            squaredNumbers.add(squareFunction.apply(number));
        }

        System.out.println("제곱된 숫자 리스트: " + squaredNumbers);
    }
}