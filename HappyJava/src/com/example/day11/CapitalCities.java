package com.example.day11;

import java.util.HashMap;
import java.util.Map;

public class CapitalCities {
    public static void main(String[] args) {
        // HashMap 생성
        Map<String, String> capitals = new HashMap<>();

        // 데이터 추가
        capitals.put("South Korea", "Seoul");
        capitals.put("United States", "Washington D.C.");
        capitals.put("Germany", "Berlin");
        capitals.put("France", "Paris");

        // 특정 키의 값 검색
        System.out.println("The capital of South Korea is " + capitals.get("South Korea"));

        // 전체 Map 출력
        System.out.println("All entries in the map:");
        capitals.forEach((country, capital) -> System.out.println(country + ": " + capital));

        // 데이터 업데이트
        capitals.put("United States", "Washington");  // 값 변경
        System.out.println("Updated capital of United States: " + capitals.get("United States"));

        // 데이터 삭제
        capitals.remove("Germany");
        System.out.println("After removing Germany:");
        capitals.forEach((country, capital) -> System.out.println(country + ": " + capital));

        // 특정 키 존재 여부 확인
        if (capitals.containsKey("France")) {
            System.out.println("France is in the map.");
        }

        // 특정 값 존재 여부 확인
        if (capitals.containsValue("Berlin")) {
            System.out.println("Berlin is in the map.");
        } else {
            System.out.println("Berlin is not in the map after Germany was removed.");
        }

        // Map이 비어있는지 확인
        System.out.println("Is the map empty? " + capitals.isEmpty());

        // Map의 크기 확인
        System.out.println("The map contains " + capitals.size() + " entries.");
    }
}

