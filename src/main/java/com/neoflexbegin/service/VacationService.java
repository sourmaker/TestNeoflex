package com.neoflexbegin.service;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Service
public class VacationService {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    private final int MONTH_COUNT = 12;
    private final double AVG_DAY_IN_MONTH = 29.3;

    private double salary;
    private int vacation;

    private final int WORK_DAY_IN_YEAR = 317;


    public String calculateVacationPay() {
        return String.format("%.2f", getSalary() / (double) WORK_DAY_IN_YEAR * getVacation());
    }

    public LocalDate dateAfterHolidays() {
        for (int i = 0; i < getVacation(); ) {
            if (calendarList.contains(date)) {
                date = date.plusDays(1);
            } else {
                date = date.plusDays(1);
                i++;
            }
        }
        return date;
    }

    public List<LocalDate> calendarList = Arrays.asList(
            LocalDate.of(2024, 1, 1),
            LocalDate.of(2024, 1, 2),
            LocalDate.of(2024, 1, 3),
            LocalDate.of(2024, 1, 4),
            LocalDate.of(2024, 1, 5),
            LocalDate.of(2024, 1, 6),
            LocalDate.of(2024, 1, 7),
            LocalDate.of(2024, 2, 23),
            LocalDate.of(2024, 3, 8),
            LocalDate.of(2024, 5, 1),
            LocalDate.of(2024, 5, 9),
            LocalDate.of(2024, 6, 1),
            LocalDate.of(2024, 6, 12)
    );

}
