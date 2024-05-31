package com.example.day14;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerExam2 {
    public static void main(String[] args) {
        int portNumber = 10001;
        ServerSocket server = null;
        Socket sock = null;
        PrintWriter pw = null;
        BufferedReader br = null;

        try {
            server = new ServerSocket(portNumber);
            System.out.println("서버가 준비되었습니다.");
            sock = server.accept();
            InetAddress inetaddr = sock.getInetAddress();
            System.out.println(inetaddr.getHostAddress() + " 로부터 연결되었습니다.");

            OutputStream out = sock.getOutputStream();
            InputStream in = sock.getInputStream();
            pw = new PrintWriter(new OutputStreamWriter(out));
            br = new BufferedReader(new InputStreamReader(in));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("클라이언트에서 받은 메시지 : " + line);
                pw.println(line);
                pw.flush();
            }
        } catch (Exception e) {
            System.out.println("포트 " + portNumber + "에서 수신 대기 중이거나 연결을 기다리는 중에 예외가 발생했습니다");
            System.out.println(e);
        } finally {
            try {
                if (pw != null) pw.close();
            } catch (Exception e) {
                System.out.println("PrintWriter를 닫는 중 오류가 발생했습니다: " + e);
            }
            try {
                if (br != null) br.close();
            } catch (Exception e) {
                System.out.println("BufferedReader를 닫는 중 오류가 발생했습니다: " + e);
            }
            try {
                if (sock != null) sock.close();
            } catch (Exception e) {
                System.out.println("Socket을 닫는 중 오류가 발생했습니다: " + e);
            }
            try {
                if (server != null) server.close();
            } catch (Exception e) {
                System.out.println("ServerSocket을 닫는 중 오류가 발생했습니다: " + e);
            }
        }
    } // main
}
