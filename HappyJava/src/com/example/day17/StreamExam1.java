package com.example.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamExam1 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("aesf", "bee", "acer", "aered", "edfd");

        List<String> filterdList = myList.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());

        System.out.println(filterdList);


        //스트림쓰지않고 코드를 만든다면??
        List<String> filteredList1 = new ArrayList<>();
        for (String str : myList) {
            if (str.startsWith("a"))
                filteredList1.add(str);
        }
        System.out.println(filteredList1);

        String[] names = {"kang", "kim", "hong", "lee", "son"};

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("==============");

        Arrays.stream(names).forEach(System.out::println);

        Arrays.stream(names).forEach(name -> System.out.println(name));

        Arrays.stream(names).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


        //짝수만 출력!!
        int[] iarr = {1, 2, 3, 4, 5, 6, 7, 8};

        //짝수만 출력
        for (Integer i : iarr) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        Arrays.stream(iarr).filter(i -> i % 2 == 0).forEach(System.out::println);


    }
}
