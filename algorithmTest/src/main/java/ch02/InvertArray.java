package ch02;

// 사용자로부터 입력받은 값으로 구성된 배열을 역순으로 정렬

import java.util.Arrays;
import java.util.Scanner;

class InvertArray {

    //--- 배열 요소 a[idx1]과 a[idx2]의 값을 교환 ---//
    static void swap(int[] a, int idx1, int idx2) {
//        int aa = 10;
//        int bb = 20;
//
//        int temp = aa;
//
//        aa = bb;
//
//        bb = temp;



        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    //--- 배열 a의 요소를 역순으로 정렬 ---//
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++)
            swap(a, i, a.length - i - 1);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("점수의 개수: ");
        int num = stdIn.nextInt();  // 점수의 개수를 입력받음

        int[] scores = new int[num]; // 점수를 저장할 배열 생성

        for (int i = 0; i < num; i++) {
            System.out.print("scores[" + i + "] : ");
            scores[i] = stdIn.nextInt(); // 점수 입력
        }

        reverse(scores); // 배열 scores의 요소를 역순으로 정렬

        System.out.println("점수를 역순으로 정렬했습니다.");
        System.out.println("scores = " + Arrays.toString(scores));
    }
}