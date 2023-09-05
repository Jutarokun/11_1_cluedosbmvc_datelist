package com.hotelplan.cluedo;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {
    public List<Person> personList = List.of(
            new Person("Max", "Mustermann", 30,  "Softwareentwickler"),
            new Person("Anna", "Schmidt", 25, "Arzt"),
            new Person("Peter", "Paul", 40, "Lehrer"),
            new Person("Maria", "Müller", 55, "Ingenieurin"),
            new Person("Ben", "Johnson", 65, "Rentner")
    );

    public  List<Person> getPersonList() {return  personList;}
}
