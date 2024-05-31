package com.example.day10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CollectionExam03 {

    //입력 처리
    //Scanner 클래스를 사용하여 사용자로부터 입력을 받습니다.
    //사용자가 0(더 이상입력하고 싶지 않을 때)을 입력할 때까지 반복하여 점수를 입력받습니다.
    //입력 받은 점수는 ArrayList<Integer>에 저장됩니다.

    //점수 유효성 검사
    //입력 받은 점수가 0부터 100 사이가 아니면 예외를 발생시키고,
    //에러 메시지로 "0-100사이의 숫자만 입력이 가능합니다."와 해당 점수를 출력합니다.
    //예외 발생 시, 에러 스택 트레이스를 출력합니다.

    //점수 리스트 관리
    //입력된 0은 점수 리스트에서 제거합니다. (종료 신호로 사용됨)

    //결과 출력
    //입력된 점수를 모두 출력합니다.
    //입력된 모든 점수의 합(총점)과 평균을 계산하여 출력합니다.
    //평균은 정수로 계산하여 출력합니다.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();

        // 점수 입력 받기
        readScores(input, scores);

        // 0점 제거
        removeZero(scores);

        // 결과 출력
        printScores(scores);

        // 리소스 정리
        input.close();
    }

    // 점수 입력 메소드
    public static void readScores(Scanner input, List<Integer> scores) {
        int score = 0;
        do {
            System.out.println("점수를 입력하세요:");
            try {
                score = input.nextInt();
                if (score < 0 || score > 100) {
                    throw new Exception("0-100 사이의 숫자만 입력이 가능합니다. 입력된 점수: " + score);
                } else if (score != 0) {
                    scores.add(score);
                }
            } catch (InputMismatchException ime) {
                System.out.println("숫자만 입력해야 합니다.");
                input.next(); // 입력 스트림을 정리
                continue;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
        } while (score != 0);
    }

    // 점수 리스트에서 0 제거 메소드
    public static void removeZero(List<Integer> scores) {
        scores.remove(Integer.valueOf(0));
    }

    // 점수 출력 및 평균 계산 메소드
    public static void printScores(List<Integer> scores) {
        System.out.println("입력된 점수를 출력합니다.");
        int sum = 0;
        for (Integer score : scores) {
            System.out.println(score);
            sum += score;
        }
        System.out.println("총점: " + sum);
        if (!scores.isEmpty()) {
            System.out.println("평균: " + (sum / scores.size()));
        } else {
            System.out.println("입력된 점수가 없습니다.");
        }
    }
}
