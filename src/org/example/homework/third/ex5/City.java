package org.example.homework.third.ex5;

import java.util.Arrays;

public final class City {
    private final String name;
    private final House[] houses;

    public City(String name, House[] houses) {
        this.name = name;
        this.houses = houses;
        //если хотите сделать копию при получении домов
        //this.houses = makeCopy(houses);
    }

    public String getName() {
        return name;
    }

    public House[] getHouses() {
        return makeCopy(this.houses);
    }

    private static House[] makeCopy(House[] houses) {
        House[] housesClone = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            housesClone[i]  = new House(houses[i].getStreetName(), houses[i].getHouseNumber());
        }
        return housesClone;
    }

    @Override
    public String toString() {
        return "City{"
                + "name='" + name + '\''
                + ", houses=" + Arrays.toString(houses)
                + '}';
    }
}
