package org.example.homework.four.ex1;

public class Bus extends Car {
    private int maxCountPassengers;

    public Bus(boolean clean, double width, double height, double length, int maxCountPassengers) {
        super(clean, width, height, length);
        this.maxCountPassengers = maxCountPassengers;
    }

    public int getMaxCountPassengers() {
        return maxCountPassengers;
    }
}
