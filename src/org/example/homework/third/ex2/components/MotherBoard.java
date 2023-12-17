package org.example.homework.third.ex2.components;

public class MotherBoard {
    private final String model;
    private final int width;
    private final int height;
    private final int length;

    public MotherBoard(String model, int width, int height, int length) {
        this.model = model;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "model='" + model + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                '}';
    }

    public String getModel() {
        return model;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }
}
