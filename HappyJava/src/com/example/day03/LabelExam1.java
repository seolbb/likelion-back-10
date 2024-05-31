package com.example.day03;

public class LabelExam1 {
    public static void main(String[] args){
        aa:
        for(int i = 0; i< 3; i++){
            for(int k = 0; k < 3; k++){
                if( i == 0 && k == 2)
                    break aa;
                System.out.println(i + ", " + k);
            }
        }
    }
}