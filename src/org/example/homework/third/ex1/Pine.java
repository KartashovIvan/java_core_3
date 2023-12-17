package org.example.homework.third.ex1;

/**
 * Сосна
 */
public class Pine extends Coniferous {
    private static final String NEEDLE_TYPE = "крупные";

    public Pine(int age) {
        super(age, NEEDLE_TYPE);
    }
}
