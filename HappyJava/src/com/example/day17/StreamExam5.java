package com.example.day17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam5 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Cherry", "Date");

        List<String> sortedFruits = fruits.stream()
                .sorted() // 오름차순 정렬
                .collect(Collectors.toList());

        System.out.println(sortedFruits);

        List<String> reverseSortedFruits = fruits.stream()
                .sorted(Comparator.reverseOrder()) // 내림차순 정렬
                .collect(Collectors.toList());


        System.out.println(reverseSortedFruits);


        int[] iarr = {5, 3, 27, 9, 5, 9, 0, 4, 34};

//        위 배열을 오름차순으로 정렬해서 출력
        Arrays.stream(iarr).sorted().forEach(System.out::print);

        //위 배열을 내림차순으로 정렬해서 출력
        // 자바 제네릭 타입엔 기본형 타입인 int타입이 올 수 없으므로
// 상위 타입인 Object 타입으로 변경한 후 내림차순 정렬
        Arrays.stream(iarr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


        int i = 10;
        Integer ii = i;   //오토 박싱.

        int j = ii;   //오토 언박싱

    }
}
