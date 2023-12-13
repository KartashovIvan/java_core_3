package org.example.homework.third.ex5;

import java.util.Arrays;

public final class City {
    private final String name;
    private final House[] houses;

    public City(String name, House[] houses) {
        this.name = name;
        this.houses = houses;
    }

    public String getName() {
        return name;
    }

    public House[] getHouses() {
        House[] temp = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            temp[i] = new House(houses[i]);
        }
        return temp;
    }

    @Override
    public String toString() {
        return "Название города " + name +
                ", дома" + Arrays.toString(houses);
    }
}
