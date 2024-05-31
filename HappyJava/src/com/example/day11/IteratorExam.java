package com.example.day11;

import java.util.*;

public class IteratorExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("===============");
        Iterator<String> iter = list.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Set<String> set = new HashSet<>();
        set.add("d");
        set.add("e");
        set.add("f");

        Iterator<String> iter2 = set.iterator();

        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }


        for (String str : set) {   //foreach  java version 5 에서 추가!!
            System.out.println(str);
        }


    }
}
