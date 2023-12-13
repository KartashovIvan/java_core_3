package org.example.homework.third.ex1;

public abstract class Conifers extends Tree{
    private final String typeNeedles;

    public Conifers(int age,String typeNeedles) {
        super(age);
        this.typeNeedles = typeNeedles;
    }
}
