package com.neoflexbegin.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Vacation implements Serializable {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    private final int MONTH_COUNT = 12;
    private final double AVG_DAY_IN_MONTH = 29.3;

    private double salary;

    private int vacation;

    public Vacation(double salary, int vacationDays) {
        this.salary = salary;
        this.vacation = vacationDays;
    }

}
