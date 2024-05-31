package com.example.day03.problemsAns;

import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        do {
            System.out.print("1과 100 사이의 숫자를 맞춰보세요: ");
            guess = scanner.nextInt();
            if (guess < answer) {
                System.out.println("더 큰 수입니다.");
            } else if (guess > answer) {
                System.out.println("더 작은 수입니다.");
            }
        } while (guess != answer);
        System.out.println("정답입니다!");
    }
}
