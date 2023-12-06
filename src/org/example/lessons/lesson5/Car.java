package org.example.lessons.lesson5;

public class Car {
    public static String factoryName = "bmw";
    private String model;
    private int yearFounded;
    private int fuel;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void startEngine() {
        //Набор действий до
        printEngineWorks();
    }

    public void startEngine(String text) {
        System.out.println(text);
        printEngineWorks();
    }

    private void printEngineWorks() {
        System.out.println("Двигатель запущен");
        System.out.println("Двигатель успешно работает");
    }

}
