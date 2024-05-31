package com.example.day09;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class TimeExam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 현재 날짜 가져오기
        LocalDate currentDate = LocalDate.now();
        System.out.println("현재 날짜: " + currentDate);

        // 사용자로부터 날짜 입력 받기
        System.out.println("비교할 날짜를 입력하세요(YYYY-MM-DD): ");
        String inputDateStr = scanner.nextLine();
        LocalDate inputDate = LocalDate.parse(inputDateStr);

        // 입력받은 날짜와 현재 날짜 사이의 차이 계산
        Period period = Period.between(currentDate, inputDate);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        // 결과 출력
        System.out.println("입력한 날짜와 현재 날짜의 차이:");
        System.out.println("년: " + years);
        System.out.println("월: " + months);
        System.out.println("일: " + days);

        scanner.close();
    }
}
