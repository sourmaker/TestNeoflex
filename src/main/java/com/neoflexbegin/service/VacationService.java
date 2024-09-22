package com.neoflexbegin.service;

import com.neoflexbegin.models.Vacation;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
@Service
public class VacationService {


    private final int WORK_DAY_IN_YEAR = 317;


    public String calculateVacationPay(Vacation vacation) {
        return   String.format("%.2f",vacation.getSalary() / (double)WORK_DAY_IN_YEAR * vacation.getVacation());
    }


    public LocalDate dateAfterHolidays(LocalDate date, Vacation vacation) {
        int holiday = 0;

        for(int i=0;i<vacation.getVacation();){
            if(calendarList.contains(date)) {
                date = date.plusDays(1);
            } else {
                date = date.plusDays(1);
                i++;
            }
        }
        return date;
    }

    public final List<LocalDate> calendarList = Arrays.asList(
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
