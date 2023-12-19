package org.example.homework.third.ex1;

public class Birch extends Deciduous {
    public Birch(int age) {
        super(age);
    }

    @Override
    public void bloom() {
        super.bloom();
        System.out.println("Береза цветет");
    }
}
