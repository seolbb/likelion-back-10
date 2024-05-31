package com.example.day03.problemsAns;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("섭씨 온도를 입력하세요.");

        double celsius = keyboard.nextDouble();

        System.out.println("화씨 온도 : "+ celsius * 9/5 + 32);
     }
}
