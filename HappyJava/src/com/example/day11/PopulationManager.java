package com.example.day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PopulationManager {
    private Map<String, Integer> populationMap = new HashMap<>();

    // 명령 상수 정의
    private static final int ADD_OR_UPDATE = 1;
    private static final int REMOVE = 2;
    private static final int DISPLAY = 3;
    private static final int DISPLAY_ALL = 4;
    private static final int EXIT = 5;

    public void addOrUpdateCity(String city, int population) {
        populationMap.put(city, population);
        System.out.println(city + "의 인구가 " + population + "으로 설정되었습니다.");
    }

    public void removeCity(String city) {
        if (populationMap.containsKey(city)) {
            populationMap.remove(city);
            System.out.println(city + "의 인구 정보가 삭제되었습니다.");
        } else {
            System.out.println(city + "의 정보를 찾을 수 없습니다.");
        }
    }

    public void displayPopulation(String city) {
        if (populationMap.containsKey(city)) {
            System.out.println(city + "의 인구는 " + populationMap.get(city) + "명 입니다.");
        } else {
            System.out.println(city + "의 정보를 찾을 수 없습니다.");
        }
    }

    public void displayAll() {
        System.out.println("모든 도시의 인구 정보:");
        populationMap.forEach((city, population) -> System.out.println(city + ": " + population + "명"));
    }

    public static void main(String[] args) {
        PopulationManager manager = new PopulationManager();
        Scanner scanner = new Scanner(System.in);

        manager.addOrUpdateCity("서울", 10000000);
        manager.addOrUpdateCity("부산", 3500000);

        while (true) {
            System.out.println("명령을 입력하세요 (1: 추가/수정, 2: 삭제, 3: 조회, 4: 전체 조회, 5: 종료): ");
            int command = scanner.nextInt(); // 사용자가 명령을 숫자로 입력
            if (command == EXIT) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            String city;
            switch (command) {
                case ADD_OR_UPDATE:
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    System.out.print("인구를 입력하세요: ");
                    int population = scanner.nextInt();
                    manager.addOrUpdateCity(city, population);
                    break;
                case REMOVE:
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    manager.removeCity(city);
                    break;
                case DISPLAY:
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    manager.displayPopulation(city);
                    break;
                case DISPLAY_ALL:
                    manager.displayAll();
                    break;
                default:
                    System.out.println("알 수 없는 명령입니다.");
            }
        }
        scanner.close();
    }
}
