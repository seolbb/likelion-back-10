package com.exam;

import java.time.LocalDate;

public class DateCalculator {
    public int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        return currentDate.getYear() - birthDate.getYear();
    }
}
