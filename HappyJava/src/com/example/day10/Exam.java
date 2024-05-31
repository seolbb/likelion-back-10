package com.example.day10;

import com.example.day02.Book;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("test");
        list.add(10);
        list.add(new Book());

//        Integer i = new Integer.valueOf(20);

        System.out.println(list);
        //제네릭이 없었을 때는 매번 형변환이 필요..
        String strValue = (String) list.get(0);
        Integer i = (Integer) list.get(1);
        System.out.println(i);
        int value = (Integer) list.get(1);

        List<String> strList = new ArrayList<>();  //제네릭!!
        strList.add("abc");
//        strList.add(10);
//        strList.add(new Book());

        String sValue = strList.get(0);


    }

}
