package com.example.enumtype;

public class TodayTest {
    public static void main(String[] args) {
        Today today = new Today();
        today.setDay(Day.FRIDAY);

//        today.setDay(100);

        System.out.println(today.getDay());

    }
}
