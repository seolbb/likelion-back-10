package com.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DateCalculatorTest {
    private DateCalculator dateCalculator;

    @BeforeEach
    void setUp(){
        dateCalculator = new DateCalculator();
    }

    @Test
    void calculateAge(){
        LocalDate birthDate = LocalDate.of(2023,5,15);
        LocalDate currentDate = LocalDate.of(2024,3,18);

        Assertions.assertEquals(1, dateCalculator.calculateAge(birthDate,currentDate));

    }
}
