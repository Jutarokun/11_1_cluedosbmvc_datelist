package com.hotelplan.cluedo;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WaffeService {
    public List<Waffe> weaponList = List.of(
            new Waffe("Knife", 12, "iron"),
            new Waffe("Sword", 25, "steel"),
            new Waffe("Axe", 30, "iron"),
            new Waffe("Spear", 20, "wood"),
            new Waffe("Bow", 15, "wood"),
            new Waffe("Crossbow", 18, "steel")
    );

    public  List<Waffe> getWeaponList() {return  weaponList;}
}
