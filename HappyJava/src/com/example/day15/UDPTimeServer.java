package com.example.day15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Date;

public class UDPTimeServer {
    public static void main(String[] args) {
//        if (args.length != 1) {
//            System.out.println("사용법 : java UDPEchoServer port");
//            System.exit(1);
//        }
        int port = 9999;
//        try {
//            port = Integer.parseInt(args[0]);
//        } catch (Exception ex) {
//            System.out.println("포트 번호를 정확히 입력해 주세요.");
//            System.exit(1);
//        }
        DatagramSocket dsock = null;
        try {
            System.out.println("서버 시작합니다.");
            dsock = new DatagramSocket(port);
            String line = null;
            while (true) {
                // 받기
                byte[] buffer = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
                dsock.receive(receivePacket);


//                String receivedData = new String(receivePacket.getData(), 0, receivePacket.getLength(), StandardCharsets.UTF_8);
//                System.out.println("test::" + receivedData.trim());
//                byte[] data = receivePacket.getData();
//                int length = receivePacket.getLength();
//                System.out.println("Received bytes: " + Arrays.toString(Arrays.copyOf(data, length)));


                java.text.SimpleDateFormat format = new java.text.SimpleDateFormat(
                        "yyyy-MM-dd HH:mm:ss a");
                String sdate = format.format(new Date());
                System.out.println(receivePacket.getAddress().getHostAddress()
                        + " 로부터 요청시간 " + sdate + " 에 처리합니다.");
                DatagramPacket sendPacket = new DatagramPacket(
                        sdate.getBytes(), sdate.getBytes().length,
                        receivePacket.getAddress(), receivePacket.getPort());
                dsock.send(sendPacket);
            } // while
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            if (dsock != null)
                dsock.close();
        }
    } // main
} // class
