package com.neoflexbegin.controller;


import com.neoflexbegin.service.VacationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/calculate")
    public String home(Model model) {
        model.addAttribute("home", new VacationService());
        return "home";
    }
}
