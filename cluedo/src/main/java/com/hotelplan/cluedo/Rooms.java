package com.hotelplan.cluedo;

public class Rooms {
    public String roomName;
    public String roomPattern;
    public int doors;

    public Rooms(String roomName, String roomPattern, int doors) {
        this.roomName = roomName;
        this.roomPattern = roomPattern;
        this.doors = doors;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomPattern() {
        return roomPattern;
    }

    public void setRoomPattern(String roomPattern) {
        this.roomPattern = roomPattern;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "roomName='" + roomName + '\'' +
                ", roomPattern='" + roomPattern + '\'' +
                ", doors=" + doors +
                '}';
    }
}
