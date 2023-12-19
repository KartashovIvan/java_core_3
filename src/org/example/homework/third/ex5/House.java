package org.example.homework.third.ex5;

public class House implements Cloneable {
    private String streetName;
    private int houseNumber;

    public House(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public House clone() throws CloneNotSupportedException {
        return (House) super.clone();
    }

    @Override
    public String toString() {
        return "House{"
                + "streetName='"
                + streetName + '\'' + ", houseNumber="
                + houseNumber + '}';
    }
}
