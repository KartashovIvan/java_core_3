package org.example.homework.third.ex2;

public class OperationSystem {
    private final String name;

    public OperationSystem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OperationSystem{" +
                "name='" + name + '\'' +
                '}';
    }
}
