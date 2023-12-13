package org.example.homework.third.ex5;

public class House {
    private int number;
    private String streetName;

    public House(int number, String streetName) {
        this.number = number;
        this.streetName = streetName;
    }

    public House (House house){
        this.number = house.getNumber();
        this.streetName = house.getStreetName();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "Дом " +
                "номер " + number +
                " - Улица " + streetName;
    }
}
