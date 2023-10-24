package com.hotelplan.cluedo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @Autowired
    DataService service;

    @GetMapping("/")
    public String addReservation(Model model) {
        model.addAttribute("personList", service.getPersonList());
        model.addAttribute("weaponList", service.getWeaponList());
        model.addAttribute("roomList", service.getRoomList());
        return "cluedo";
    }
}
