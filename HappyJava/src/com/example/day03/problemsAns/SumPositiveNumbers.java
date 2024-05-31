package com.example.day03.problemsAns;

import java.util.Scanner;

public class SumPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        do {
            System.out.print("양의 정수를 입력하세요 (0으로 종료): ");
            number = scanner.nextInt();
            if (number > 0) {
                sum += number;
            }
        } while (number != 0);
        System.out.println("입력한 양의 정수의 합: " + sum);
    }
}
