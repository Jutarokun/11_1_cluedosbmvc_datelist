package com.hotelplan.cluedo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @Autowired
    PersonService PersonService;

    @Autowired
    WaffeService weaponService;

    @Autowired
    RoomService raumService;

    @GetMapping("/")
    public String addReservation(Model model) {
        model.addAttribute("personList", PersonService.getPersonList());
        model.addAttribute("weaponList", weaponService.getWeaponList());
        model.addAttribute("roomList", raumService.getRoomList());
        return "cluedo";
    }
}
