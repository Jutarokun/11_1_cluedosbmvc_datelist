package com.hotelplan.cluedo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    public List<Rooms> roomList = List.of(
            new Rooms("Living Room", "Circles", 1),
    new Rooms("Bedroom", "Squares", 2),
    new Rooms("Kitchen", "Triangles", 3),
    new Rooms("Bathroom", "Hexagons", 4),
    new Rooms("Dining Room", "Pentagons", 5),
    new Rooms("Office", "Heptagons", 6)
);

    public  List<Rooms> getRoomList() {return  roomList;}
}
