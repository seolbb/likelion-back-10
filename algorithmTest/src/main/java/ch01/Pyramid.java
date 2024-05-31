package ch01;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이등변삼각형 단 수를 입력해주세요 : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++)     System.out.print(" ");
            for (int j = 0; j < (i*2+1); j++)   System.out.print("*");
            System.out.println();
        }
    }
}