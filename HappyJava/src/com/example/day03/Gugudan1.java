package com.example.day03;

import java.util.Scanner;

public class Gugudan1 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("단을 입력하세요.");
        int dan = keyboard.nextInt();

        for(int i = 1; i <= 9; i++){
            System.out.println( dan +" * " + i + " = " + (dan * i));
        }
    }
}