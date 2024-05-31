package com.example.day10;

import java.util.Arrays;
import java.util.List;

public class NumberProcessor {
    // 상한을 사용하여 제네릭 메소드 정의
    public static <T extends Number> double sum(List<T> numbers) {
        double total = 0.0;
        for (Number number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);

        // Integer와 Double 모두 Number의 하위 클래스이므로 메소드 사용 가능
        System.out.println("Sum of integers: " + sum(integerList));
        System.out.println("Sum of doubles: " + sum(doubleList));
    }

}