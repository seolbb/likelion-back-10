package com.example.day09;

public class Smartphone {
    // 스마트폰의 다른 기능들...

    public interface Camera {
        void takePhoto();
    }

    public class BasicCamera implements Camera {
        @Override
        public void takePhoto() {
            System.out.println("사진을 찍습니다.");
        }
    }

    public void activateCamera() {
        Camera camera = new BasicCamera();
        camera.takePhoto();
    }
}