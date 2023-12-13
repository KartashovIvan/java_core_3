package org.example.homework.third.ex2;

public abstract class Telephone {
    private final String name;

    public Telephone(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "name='" + name + '\'' +
                '}';
    }
}
