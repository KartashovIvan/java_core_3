package org.example.homework.third.ex5;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {
        House[] houses = {
            new House("Lenina", 1),
            new House("Mira", 2)
        };
        houses[1].setHouseNumber(1);
        City moscow = new City("Moscow", houses);
        moscow.getHouses()[1].setHouseNumber(10);
        System.out.println(moscow);

        System.out.println();
        House test = new House("Test", 1);
        House clone = test.clone();
        System.out.println();
    }
}
