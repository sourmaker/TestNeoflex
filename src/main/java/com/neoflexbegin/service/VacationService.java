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

    private double salary;
    private int vacation;

    private final int WORK_DAY_IN_YEAR = 317;


    public String calculateVacationPay() {
        return String.format("%.2f", getSalary() / (double) WORK_DAY_IN_YEAR * getVacation());
    }


    public LocalDate dateAfterHolidays2() {
        for (int i = 0; i < getVacation(); ) {
            if (listOfHolidays(date).contains(date)) {
                date = date.plusDays(1);
            } else {
                date = date.plusDays(1);
                i++;
            }
        }
        return date;
    }

    private List<LocalDate> listOfHolidays(LocalDate date) {
        int year = date.getYear();
        return Arrays.asList(
                LocalDate.of(year, 1, 2),
                LocalDate.of(year, 1, 2),
                LocalDate.of(year, 1, 3),
                LocalDate.of(year, 1, 4),
                LocalDate.of(year, 1, 5),
                LocalDate.of(year, 1, 6),
                LocalDate.of(year, 1, 7),
                LocalDate.of(year, 2, 23),
                LocalDate.of(year, 3, 8),
                LocalDate.of(year, 5, 1),
                LocalDate.of(year, 5, 9),
                LocalDate.of(year, 6, 1),
                LocalDate.of(year, 6, 12));
    }


}
