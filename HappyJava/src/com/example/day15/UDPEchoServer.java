package com.example.day15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoServer {
    public static void main(String[] args) {
        //1.UDP 통신 특정 port에 DatagramSocket 생성
        try (
                DatagramSocket datagramSocket = new DatagramSocket(7777);) {
            while (true) {
                byte[] receiveData = new byte[1024];
                byte[] sendData;
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                datagramSocket.receive(receivePacket);

                String message = new String(receivePacket.getData()).trim();

                InetAddress clientAddress = receivePacket.getAddress();
                int port = receivePacket.getPort();

                DatagramPacket sendPacket = new DatagramPacket(message.getBytes(), message.getBytes().length, clientAddress, port);
                datagramSocket.send(sendPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
