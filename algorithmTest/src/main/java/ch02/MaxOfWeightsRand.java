package ch02;

// 배열 요소의 최댓값을 출력하는 예제(값을 난수로 생성)

import java.util.Random;
import java.util.Scanner;

class MaxOfWeightsRand {
    // 배열 weights의 최댓값을 구하여 반환
    static int maxOf(int[] weights) {
        int max = weights[0];
        for (int i = 1; i < weights.length; i++)
            if (weights[i] > max)
                max = weights[i];
        return max;
    }

    public static void main(String[] args) {
//        Math.random();
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("몸무게의 최댓값을 구합니다.");
        System.out.print("사람 수: ");
        int num = stdIn.nextInt();                // 입력받은 사람 수로 배열의 크기를 결정

        int[] weights = new int[num];             // 사람 수만큼 몸무게를 저장할 배열 생성

        for (int i = 0; i < num; i++) {
            weights[i] = 40 + rand.nextInt(60);   // 몸무게를 40kg에서 100kg 사이의 난수로 결정
            System.out.println("weights[" + i + "] : " + weights[i]);
        }

        System.out.println("최댓값은 " + maxOf(weights) + "입니다.");
    }
}