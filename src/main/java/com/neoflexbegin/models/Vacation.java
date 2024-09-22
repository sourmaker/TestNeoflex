package com.neoflexbegin.models;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.time.LocalDate;




@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vacation implements Serializable {

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate date;

    private final int MONTH_COUNT = 12;
    private final double AVG_DAY_IN_MONTH = 29.3;

    @NotEmpty(message = "Зарплата должна быть больше нуля")
    @Min(value = 1, message = "Зарплата должна быть больше нуля")
    private double salary;

    @Min(value = 1, message = "Минимум один день отпуска")
    private int vacation;

    public Vacation(double salary, int vacationDays) {
        this.salary = salary;
        this.vacation = vacationDays;
    }

}
