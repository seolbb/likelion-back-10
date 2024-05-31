package com.example.day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        // 숫자 추가
        int[] numbers = {1, 2, 2, 3, 4};
        for (int num : numbers) {
            list.add(num);
            set.add(num);
        }

        // List와 Set 출력
        System.out.println("List: " + list);
        System.out.println("Set: " + set);
    }
}
