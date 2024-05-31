package com.example.day03.problemsAns;

public class Gugudan {
         public static void main(String[] args) {
            int i = 2;
            while (i <= 9) {
                int j = 1;
                while (j <= 9) {
                    System.out.println(i + " * " + j + " = " + (i * j));
                    j++;
                }
                i++;
            }
        }
    }
