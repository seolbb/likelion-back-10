package com.example.day03.problemsAns;

import java.util.Scanner;

public class ifExam02 {
	/*
	 * “몸무게+100-키”를 비만수치 공식이라고 하자. 키와 몸무게를 자연수로 입력받아 첫 번째 줄에 비만수치를 출력하고, 비만수치가
	 * 0보다 크면 다음줄에 비만이라는 메시지를 출력하는 프로그램을 작성하시오. (출력형식은 아래 출력 예를 참고하세요.)
	 *
	 * 155 60
	 *
	 * 비만수치는 5입니다. 당신은 비만이군요.
	 */
	static void 비만도측정(int height, int weight) {
		int result = weight + 100 - height;
		System.out.println("비만수치는 " + result + "입니다.");
		if (result > 0)
			System.out.println("당신은 비만이군요.");
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		while (true) {
			System.out.println("키를 입력하세요.");
			int height = keyboard.nextInt();
			System.out.println("몸무게를 입력하세요.");
			int weight = keyboard.nextInt();
//			비만도측정(height, weight);



			System.out.println("종료하시겠습니다??  종료는 0, 계속은 아무거나 입력");
			int endFlag = keyboard.nextInt();
			if(endFlag == 0)
				break;
		}
		System.out.println("시스템이 종료되었습니다.");

	}

}
