package com.neoflexbegin.controller;

import com.neoflexbegin.models.Vacation;
import com.neoflexbegin.service.VacationService;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@Controller
public class VacationController {

    @PostMapping("/")
    public String calculateVacation(@ModelAttribute Vacation vacation
            ,@RequestParam(value = "date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date
            ,@ModelAttribute VacationService vacationService
            ,Model model) {
        model.addAttribute("title", vacation);
        model.addAttribute("dateFrom", vacation.getDate());
        model.addAttribute("dateAfter", vacationService.dateAfterHolidays(date,vacation));
        model.addAttribute("count", vacationService.calculateVacationPay(vacation));

        return "vacationPay";
    }
}
