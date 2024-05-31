package com.example.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoThreadServer2 {
    private static final int PORT_NUMBER = 12345; // 서버 포트 번호

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT_NUMBER)) {
            System.out.println("서버가 포트 " + PORT_NUMBER + "에서 시작되었습니다.");

            while (true) {
                Socket clientSocket = serverSocket.accept(); // 클라이언트 연결 수락
                System.out.println("새로운 클라이언트가 연결되었습니다: " + clientSocket);

                // 클라이언트를 위한 새 스레드 시작
//                new Thread(new ClientHandler(clientSocket)).start();
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                Thread thread = new Thread(clientHandler);
                thread.start();
            }
        } catch (IOException e) {
            System.out.println("서버를 포트 " + PORT_NUMBER + "에서 시작할 수 없습니다.");
            System.out.println(e.getMessage());
        }
    }
}

class ClientHandler implements Runnable {
    private Socket clientSocket;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    @Override
    public void run() {
        try (PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                out.println(inputLine); // 클라이언트로부터 받은 메시지를 되돌려줌
            }
        } catch (IOException e) {
            System.out.println("클라이언트 처리 중 예외 발생: " + e.getMessage());
        } finally {
            try {
                clientSocket.close();
                System.out.println("클라이언트 연결이 종료되었습니다.");
            } catch (IOException e) {
                System.out.println("소켓을 닫는 중 오류 발생: " + e.getMessage());
            }
        }
    }
}


