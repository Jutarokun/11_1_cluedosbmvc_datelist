package com.hotelplan.cluedo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @Autowired
    PersonService service;

    @GetMapping("/")
    public String addReservation(Model model) {
        model.addAttribute("getPersonList", service.getPersonList());
        return "cluedo";
    }
}
