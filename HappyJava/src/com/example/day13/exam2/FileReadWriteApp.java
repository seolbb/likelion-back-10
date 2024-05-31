package com.example.day13.exam2;

import java.io.*;
import java.util.Scanner;

class FileReaderTask implements Runnable {
    private String filePath;

    public FileReaderTask(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("읽은 데이터: " + line);
            }
        } catch (IOException e) {
            System.err.println("파일 읽기 중 오류 발생: " + e.getMessage());
        }
    }
}

class FileWriterTask implements Runnable {
    private String filePath;

    public FileWriterTask(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            System.out.println("데이터 입력을 시작하세요 (종료하려면 'exit' 입력):");
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                if ("exit".equalsIgnoreCase(input)) {
                    break;
                }
                writer.write(input);
                writer.newLine();
                writer.flush();  // 데이터를 파일에 즉시 기록
            }
        } catch (IOException e) {
            System.err.println("파일 쓰기 중 오류 발생: " + e.getMessage());
        }
    }
}

public class FileReadWriteApp {
    public static void main(String[] args) {
        Thread fileReaderThread = new Thread(new FileReaderTask("input.txt"));
        Thread fileWriterThread = new Thread(new FileWriterTask("output.txt"));

        fileReaderThread.start();  // 파일 읽기 스레드 시작
        fileWriterThread.start();  // 파일 쓰기 스레드 시작
    }
}
/*
사용법
input.txt 파일을 프로젝트의 루트 디렉토리에 미리 생성하고, 일부 텍스트 데이터를 포함시킵니다.
프로그램을 실행하고, 콘솔에서 output.txt 파일로 데이터를 입력합니다.
입력을 종료하려면 "exit"를 입력합니다.
이 예제는 파일 읽기 작업과 파일 쓰기 작업을 동시에 처리하는 간단한 예제입니다.
파일 읽기 작업은 input.txt에서 수행되며, 파일 쓰기 작업은 사용자 입력을 받아 output.txt에 저장합니다.
두 작업은 독립적으로 실행되며 서로 간섭하지 않습니다.
 */