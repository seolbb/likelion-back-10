package com.example.day17;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class AggregateStreamExam {
    public static void main(String[] args) {
        int[] intArr = {12, 36, 53, 35, 66, 57};

        int max2 = Arrays.stream(intArr).boxed().max(Integer::compareTo).orElse(0);

        List<Integer> numbers = Arrays.asList(12, 36, 53, 35, 66, 57);

        long count = numbers.stream().count(); // 요소 개수
        int max = numbers.stream().max(Integer::compareTo).orElse(0); // 최대 값, List가 비어있으면 0 반환
        int min = numbers.stream().min(Integer::compareTo).orElse(0); // 최소 값
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0); // 평균 값
        int sum = numbers.stream().mapToInt(Integer::intValue).sum(); // 총합

        System.out.println(count);
        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
        System.out.println(sum);

        long count2 = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6})
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("배열의 요소 수:" + count2);

        long sum2 = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6})
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("배열의 합계:" + sum2);

        int min2 = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6})
                .filter(n -> n % 2 == 0)
                .min()
                .getAsInt();
        System.out.println("배열의 최소값:" + min2);

        OptionalInt minOptional = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6})
                .filter(n -> n % 2 == 0)
                .min();

        if (minOptional.isPresent()) {
            int min3 = minOptional.getAsInt();
            System.out.println("Minimum even number: " + min3);
        } else {
            System.out.println("No even numbers found.");
        }


        double avg2 = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6})
                .filter(n -> n % 2 == 0)
                .average()
//                .getAsDouble();
                .orElse(Double.NaN);
        System.out.println("배열의 평균값:" + avg2);
    }
}
