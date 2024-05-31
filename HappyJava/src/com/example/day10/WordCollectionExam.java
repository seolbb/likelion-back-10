package com.example.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordCollectionExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        // 단어 입력 받기
        readWords(input, words);

        // "quit" 제거
        removeQuit(words);

        // 결과 출력
        printWords(words);

        // 리소스 정리
        input.close();
    }

    // 단어 입력 메소드
    public static void readWords(Scanner input, List<String> words) {
        String word;
        do {
            System.out.println("단어를 입력하세요 (종료하려면 'quit' 입력):");
            word = input.nextLine();
            if (!word.equalsIgnoreCase("quit")) {
                words.add(word);
            }
        } while (!word.equalsIgnoreCase("quit"));
    }

    // "quit" 단어 제거 메소드
    public static void removeQuit(List<String> words) {
        words.remove("quit");
    }

    // 단어 출력 및 통계 계산 메소드
    public static void printWords(List<String> words) {
        System.out.println("입력된 단어를 출력합니다.");
        int totalLength = 0;
        String longestWord = "";
        for (String word : words) {
            System.out.println(word);
            totalLength += word.length();
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("총 단어 수: " + words.size());
        System.out.println("글자 수의 합: " + totalLength);
        System.out.println("가장 긴 단어: " + longestWord + " (" + longestWord.length() + " 글자)");
    }
}
