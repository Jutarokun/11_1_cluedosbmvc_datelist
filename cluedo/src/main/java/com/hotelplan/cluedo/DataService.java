package com.hotelplan.cluedo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {
    public List<Person> personList = List.of(
            new Person("Max", "Mustermann", 30,  "Softwareentwickler"),
            new Person("Anna", "Schmidt", 25, "Arzt"),
            new Person("Peter", "Paul", 40, "Lehrer"),
            new Person("Maria", "Müller", 55, "Ingenieurin"),
            new Person("Ben", "Johnson", 65, "Rentner")
    );

    public  List<Person> getPersonList() {return  personList;}

    public List<Rooms> roomList = List.of(
            new Rooms("Living Room", "Circles", 1),
            new Rooms("Bedroom", "Squares", 2),
            new Rooms("Kitchen", "Triangles", 3),
            new Rooms("Bathroom", "Hexagons", 4),
            new Rooms("Dining Room", "Pentagons", 5),
            new Rooms("Office", "Heptagons", 6)
    );

    public  List<Rooms> getRoomList() {return  roomList;}

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
