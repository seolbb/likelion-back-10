package com.example.day09;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExam {

    public static void printCalendar(int year, int month) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month - 1);
        c.set(Calendar.DATE, 1);

        //마지막날
        int lastOfDate = c.getActualMaximum(Calendar.DATE);
        //해당월의 첫 요일
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("\t\t " + c.get(Calendar.YEAR) + "년" + (c.get(Calendar.MONTH) + 1) + "월");

        System.out.println("일\t월\t화\t수\t목\t금\t토");
        //첫날 출력 전까지 공백 출력
        for (int i = 1; i < week; i++) {
            System.out.print("\t");
        }
        //날짜를 출력
        for (int i = 1; i <= lastOfDate; i++) {
            System.out.print(i + "\t");
            if ((week + i - 1) % 7 == 0) {
                System.out.println();  //일주일마다 줄바꿈.
            }
        }


    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("년도를 입력하세요.");
        int year = keyboard.nextInt();
        System.out.println("월 을 입력하세요.");
        int month = keyboard.nextInt();

        printCalendar(year, month);


    }
}
