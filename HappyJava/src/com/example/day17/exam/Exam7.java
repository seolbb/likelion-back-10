package com.example.day17.exam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Temperature {
    private String city;
    private int maxTemp;

    public Temperature(String city, int maxTemp) {
        this.city = city;
        this.maxTemp = maxTemp;
    }

    public String getCity() {
        return city;
    }

    public int getMaxTemp() {
        return maxTemp;
    }
}

public class Exam7 {
    public static void main(String[] args) {
        //7. 도시별 최고 온도 기록
        List<Temperature> temperatures = Arrays.asList(
                new Temperature("Seoul", 33),
                new Temperature("New York", 30),
                new Temperature("Seoul", 34),
                new Temperature("New York", 28)
        );

        Map<String, Integer> highestTemperatures = temperatures.stream()
                .collect(Collectors.toMap(
                        Temperature::getCity,
                        Temperature::getMaxTemp,
                        Integer::max
                ));

        highestTemperatures.forEach((city, maxTemp) ->
                System.out.println(city + ": " + maxTemp)
        );
    }
}
