package com.example.day03;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ForExam1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int count = keyboard.nextInt();


        int sum =0;


        for(int i = 1; i <= count; i++){
//            int sum = 0;
            if(i%2==0) {
//                System.out.println(i);
                sum = sum + i; // sum += i;
//                System.out.println(sum);
            }
        }
        System.out.println("1부터 "+count + "의 짝수의 합 : "+sum);

        int index = 0;
        for(;;){  //무한루프
            System.out.println("hahaha");
            if(index++ > 5)
                break;
        }

//        while (true){
//
//        }
    }
}




//1-100 까지의 짝수의 합을 출력해주세요.

// 1. 1-100 까지 출력

//2. 짝수만 출력

//3. 출력하는거 대신에 값을 더해 봐야지..   (더한 값을 담을 변수!! )