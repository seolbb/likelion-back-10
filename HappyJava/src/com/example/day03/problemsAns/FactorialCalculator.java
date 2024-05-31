package com.example.day03.problemsAns;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("정수 n을 입력하세요: ");
        int n = keyboard.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
    }
}
