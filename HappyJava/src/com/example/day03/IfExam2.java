package com.example.day03;

import java.util.Random;

public class IfExam2 {
    public static void main(String[] args) {
        int i = 10;

        if(i<10){
            System.out.println(i);
            System.out.println("ha");
            System.out.println("hi");
        }
        
        /*do{
            
        }*/while (i<10){
            System.out.println("while문이 수행되지 않아요");
        }

        do{
            System.out.println("한번은 수행해요^^");
        }while(i++<20);


        Random random = new Random();
        random.nextInt(100);

        int v = random.nextInt(4,30) + 1;

        int value = (int)(Math.random() * 100) +1;
    }
}
