package com.example.day17.exam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student2 {
    private String name;
    private int age;
    private int score;

    public Student2(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }
}

public class Exam6 {
    public static void main(String[] args) {
        //6. 나이대별 평균 점수 계산
        List<Student2> students = Arrays.asList(
                new Student2("Alice", 14, 88),
                new Student2("Bob", 23, 82),
                new Student2("Charlie", 17, 95),
                new Student2("David", 21, 73)
        );

        Map<Integer, Double> averageScoresByAgeGroup = students.stream()
                .collect(Collectors.groupingBy(
                        student -> (student.getAge() / 10) * 10,
                        Collectors.averagingInt(Student2::getScore)
                ));

        averageScoresByAgeGroup.forEach((ageGroup, avgScore) ->
                System.out.println(ageGroup + "s: " + avgScore)
        );
    }
}
