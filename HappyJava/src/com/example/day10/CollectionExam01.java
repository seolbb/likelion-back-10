package com.example.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CollectionExam01 {
    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<>(); //가변길이 자료구조!!
        System.out.println(strList.size());

        strList.add("a");
        strList.add("b");
        strList.add("c");

//        System.out.println(strList.size());
//        strList.add("a");
//        strList.add("b");
//        strList.add("c");
//        strList.add("a");
//        strList.add("b");
//        strList.add("c");
//        strList.add("a");
//        strList.add("b");
//        strList.add("c");
//        strList.add("a");
//        strList.add("b");
//        strList.add("c");
//        System.out.println(strList.size());
//        for (String str : strList) {
//            System.out.println(str);
//        }

        System.out.println("============");
        System.out.println(strList.get(0));

        System.out.println("============");

//        ArrayList<String> vector = new ArrayList<>();
//        vector.addElement("a");
//        vector.addElement("b");


        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("hahaha");

        for (String str : list) {
            System.out.println(str);
        }

        System.out.println(list);

        System.out.println(list.get(0));

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println(integerList);
        int value = integerList.get(0);
        System.out.println(integerList);
        System.out.println(integerList.remove(0));
        System.out.println(integerList);
        System.out.println(integerList.contains(5));
        System.out.println(integerList.remove(Integer.valueOf(2)));
        System.out.println(integerList);
        integerList.add(5);
        integerList.add(5);
        System.out.println(integerList);
        integerList.remove(Integer.valueOf(5));
        System.out.println(integerList);
        integerList.clear();
        System.out.println(integerList);


    }
}
