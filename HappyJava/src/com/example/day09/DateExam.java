package com.example.day09;

import java.util.Calendar;
import java.util.Date;

public class DateExam {
    public static void main(String[] args) {
        Date now = new Date(2020, 1, 1);
        System.out.println(now);

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);

        System.out.println(calendar.get(Calendar.MONTH));  //월 - 0 부터 시작
        System.out.println(calendar.get(calendar.YEAR));
        System.out.println(calendar.get(calendar.DATE));

        calendar.set(Calendar.MONTH, 3);

        System.out.println(calendar.getActualMaximum(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        //년 월을 입력 받아서 해당 년의 월의 달력을 출력해 보세요.


    }
}
