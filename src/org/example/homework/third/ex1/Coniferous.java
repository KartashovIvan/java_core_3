package org.example.homework.third.ex1;

/**
 * Хвойные
 */
public abstract class Coniferous extends Tree {
    private final String needlesType;

    public Coniferous(int age, String needlesType) {
        super(age);
        this.needlesType = needlesType;
    }

    public String getNeedlesType() {
        return needlesType;
    }
}
