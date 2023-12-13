package org.example.homework.third.ex1;

public class Birch extends Deciduous{
    public Birch(int age) {
        super(age);
    }

    @Override
    public void blooms() {
        super.blooms();
        System.out.println("Береза источает аллергены");
    }
}
