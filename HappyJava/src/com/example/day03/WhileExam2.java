package com.example.day03;

public class WhileExam2 {
    public static void main(String[] args) {
        int num=1;
        int total=0;

        while(num<=100){
            if(num%2==0){
                total+=num;  //total = total + num
//                continue;
            }
            System.out.println(num);
            num++;
        }
        System.out.println(total);
    }
}
