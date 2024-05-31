package ch01;

public class Multi99Table {

    public static void main(String[] args) {
        System.out.println("----- 구구단 곱셈표 -----");

        for (int i = 1; i <= 9; i++) { // 1단부터 9단까지 반복
            for (int j = 1; j <= 9; j++) // 각 단의 1부터 9까지 곱
                System.out.printf("%3d", i * j); // 곱셈 결과 출력
            System.out.println(); // 한 단이 끝날 때마다 줄바꿈
        }
    }
}