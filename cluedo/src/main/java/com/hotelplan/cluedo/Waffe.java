package com.hotelplan.cluedo;

public class Waffe {
    public String description;
    public int howLong;
    public String material;

    public Waffe(String description, int howLong, String material) {
        this.description = description;
        this.howLong = howLong;
        this.material = material;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHowLong() {
        return howLong;
    }

    public void setHowLong(int howLong) {
        this.howLong = howLong;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Waffe{" +
                "description='" + description + '\'' +
                ", howLong=" + howLong +
                ", material='" + material + '\'' +
                '}';
    }
}
