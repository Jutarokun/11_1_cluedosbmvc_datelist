package com.hotelplan.cluedo;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {
    public List<Person> personList = List.of(new Person("test1", "test", 1, "jon"));

    public  List<Person> getPersonList() {return  personList;}
}
