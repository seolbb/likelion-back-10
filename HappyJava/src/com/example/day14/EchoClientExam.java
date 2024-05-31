package com.example.day14;

import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClientExam {
    public static void main(String[] args) throws Exception {
        //1. Socket 생성
        Socket sock = new Socket("127.0.0.1", 9999);
        System.out.println(10001 + "포트와 잘 연결 되었습니다.");

        //2. 데이터 읽고 쓰기
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));

        //클라이언트가 키보드를 통해 입력하기위한 통로
        BufferedReader keybord = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = keybord.readLine()) != null) {
            if (line.equalsIgnoreCase("quit")) {
                break;
            }
            //서버에게 보냄.
            pw.println(line);
            pw.flush();

            //서버에서 받음
            String echo = br.readLine();
            System.out.println("서버로부터 받은 응답 메시지 : " + echo);
        }

        //3. 연결 종료.
        pw.close();
        br.close();
        keybord.close();
        sock.close();
    }
}
