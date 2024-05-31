package ch02;

public class TwoDimensionalArrayExample {
    public static void main(String[] args) {
        // 3명의 학생과 4과목의 점수를 저장할 수 있는 2차원 배열 선언
        int[][] scores = new int[3][4];

        // 데이터 할당
        scores[0][0] = 90; // 첫 번째 학생의 첫 번째 과목 점수
        scores[0][1] = 80;
        scores[0][2] = 70;
        scores[0][3] = 60;

        scores[1][0] = 80; // 두 번째 학생의 첫 번째 과목 점수
        scores[1][1] = 70;
        scores[1][2] = 60;
        scores[1][3] = 50;

        scores[2][0] = 70; // 세 번째 학생의 첫 번째 과목 점수
        scores[2][1] = 60;
        scores[2][2] = 50;
        scores[2][3] = 40;
        // 배열의 내용 출력
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번째 학생의 과목 점수:");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println(scores[i][j]);
            }
            System.out.println();
        }

    }
}