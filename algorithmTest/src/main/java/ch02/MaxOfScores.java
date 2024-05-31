package ch02;

import java.util.Arrays;

public class MaxOfScores {
    //점수배열을 입력받아서 최대값을 리턴하는 메소드
    static int maxOf(int[] scores){
//        Arrays.sort(scores);
//        return 0;
        int max = scores[0];

        for(int score : scores) {
            if (max < score) {
                max = score;
            }
        }

        return max;
    }
    //학생수를 입력받고, 학생 수만큼 점수를 입력받아서 점수배열을 리턴하는 메소드
    static int[] inputScores(){

        return null;
    }

    public static void main(String[] args) {

    }
}
