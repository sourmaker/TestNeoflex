package com.neoflexbegin.controller;

import com.neoflexbegin.service.VacationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class VacationController {

    @PostMapping("/")
    public String calculateVacation(@ModelAttribute VacationService vacationService, Model model) {
        model.addAttribute("title", vacationService);
        model.addAttribute("dateFrom", vacationService.getDate());
        model.addAttribute("dateAfter", vacationService.dateAfterHolidays());
        model.addAttribute("count", vacationService.calculateVacationPay());

        return "vacationPay";
    }
}
