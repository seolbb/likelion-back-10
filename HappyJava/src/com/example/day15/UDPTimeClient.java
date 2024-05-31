package com.example.day15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UDPTimeClient {
    public static void main(String[] args) {
//        if (args.length != 2) {
//            System.out.println("사용법 : java UDPEchoClient ip port");
//            System.exit(1);
//        }
//        String ip = args[0];
//        int port = 0;
//        try {
//            port = Integer.parseInt(args[1]);
//        } catch (Exception ex) {
//            System.out.println("포트 번호를 정확하게 입력해 주세요.");
//            System.exit(1);
//        }

        String ip = "localhost";
        int port = 9999;
        
        InetAddress inetaddr = null;
        try {
            inetaddr = InetAddress.getByName(ip);
        } catch (UnknownHostException e) {
            System.out.println("잘못된 서버 주소나 ip입니다.");
            System.exit(1);
        }


        DatagramSocket dsock = null;
        try {
            dsock = new DatagramSocket();
            String line = null;
            // 보내기
            DatagramPacket sendPacket = new DatagramPacket("".getBytes(),
                    "".getBytes().length, inetaddr, port);
            dsock.send(sendPacket);
            byte[] buffer = new byte[200];
            DatagramPacket receivePacket = new DatagramPacket(buffer,
                    buffer.length);
            dsock.receive(receivePacket);
            // 서버로부터 받은 시간 출력
            String msg = new String(receivePacket.getData(), 0,
                    receivePacket.getLength());
            System.out.println("서버로부터 받은 현재 시간 :" + msg.trim());
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            if (dsock != null)
                dsock.close();
        }
    } // main
} // class
