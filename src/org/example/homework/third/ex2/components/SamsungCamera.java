package org.example.homework.third.ex2.components;

public class SamsungCamera extends Camera {
    private static final String ZOOM = "20x";

    public SamsungCamera() {
        super(ZOOM);
    }

    @Override
    public String toString() {
        return "SamsungCamera{" +
                "zoom='" + zoom + '\'' +
                '}';
    }
}
