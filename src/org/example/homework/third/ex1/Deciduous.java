package org.example.homework.third.ex1;

/**
 * Лиственное
 */
public abstract class Deciduous extends Tree {
    private boolean haveLeaves = true;

    public Deciduous(int age) {
        super(age);
    }

    public void fallLeaves() {
        this.haveLeaves = false;
    }

    public void bloom() {
        this.haveLeaves = true;
    }
}
