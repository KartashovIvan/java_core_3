package org.example.homework.third.ex1;

public abstract class Deciduous extends Tree {
    private boolean leaves = true;

    public Deciduous(int age) {
        super(age);
    }

    public void leavesFall() {
        leaves = false;
    }

    public void blooms() {
        leaves = true;
    }
}
