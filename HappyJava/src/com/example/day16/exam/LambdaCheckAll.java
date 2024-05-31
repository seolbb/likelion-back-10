package com.example.day16.exam;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//주어진 `List<Integer>`의 모든 요소가 짝수인지 확인하라.
// 람다식을 활용하여 조건 검사를 수행하고 결과를 출력하라.
public class LambdaCheckAll {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        // 람다식을 사용하여 모든 요소 검사
        Predicate<Integer> isEven = n -> n % 2 == 0;
        boolean allEven = true;

        for (Integer number : numbers) {
            if (!isEven.test(number)) {
                allEven = false;
                break;
            }
        }

        System.out.println("모든 숫자가 짝수입니까? " + allEven);
    }
}