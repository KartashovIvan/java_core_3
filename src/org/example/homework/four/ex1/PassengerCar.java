package org.example.homework.four.ex1;

public class PassengerCar extends Car {
    private final boolean cruiseControl;

    public PassengerCar(boolean clean, double width, double height, double length, boolean cruiseControl) {
        super(clean, width, height, length);
        this.cruiseControl = cruiseControl;
    }
}
