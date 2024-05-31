package com.example.day17;

import java.util.Arrays;
import java.util.List;

public class MatchTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        boolean allPositive = numbers.stream().allMatch(n -> n > 0); // 모든 숫자가 양수인지
        boolean anyNegative = numbers.stream().anyMatch(n -> n < 0); // 어떤 숫자라도 음수인지
        boolean noneAboveTen = numbers.stream().noneMatch(n -> n > 10); // 모든 숫자가 10 이하인지

        System.out.println(allPositive);

        int[] intArr = {2, 4, 6, 8};

        boolean result = false;
        result = Arrays.stream(intArr).allMatch(a -> a % 3 == 0);

        System.out.println("모두 3의 배수 입니까??" + result);

        result = Arrays.stream(intArr).anyMatch(a -> a % 3 == 0);
        System.out.println("하나라도 3의 배수 입니까??" + result);

        result = Arrays.stream(intArr).noneMatch(a -> a % 3 == 0);
        System.out.println("모두 3의 배수가 아닙니까??" + result);

    }
}
