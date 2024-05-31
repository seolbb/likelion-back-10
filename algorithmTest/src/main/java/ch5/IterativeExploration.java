package ch5;

import java.util.Scanner;
import java.util.Stack;

class IterativeExploration {
    // 숫자 n을 사용하여 순수 재귀 패턴을 생성하고 출력하는 메서드를 반복문으로 구현
    static void displayPatternIteratively(int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(n);

        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (current > 0) {
                // 첫 번째 재귀 호출을 스택에 푸시하는 것으로 대체
                stack.push(current - 1);
                System.out.println("Number: " + current);

                // 두 번째 재귀 호출을 스택에 푸시하는 것으로 대체
                // 현재 구현에서는 순서와 출력 패턴이 원본 재귀 함수와 정확히 일치하지 않을 수 있음
                if (current - 2 > 0) {
                    stack.push(current - 2);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("출력할 숫자를 입력하세요: ");
        int x = stdIn.nextInt();

        displayPatternIteratively(x);
    }
}