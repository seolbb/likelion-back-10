package com.example.day09;

public class Network {
    private static int totalMessages = 0;

    public static class Message {
        private String content;

        public Message(String content) {
            this.content = content;
            totalMessages++;
        }

        public void send() {
            System.out.println("메시지 전송: " + content);
            System.out.println("전체 메시지 수: " + totalMessages);
        }
    }

    public static int getTotalMessages() {
        return totalMessages;
    }
}
