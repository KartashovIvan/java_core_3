package org.example.homework.third.ex2.components;

public class IphoneCamera extends Camera {
    private static final String ZOOM = "15x";
    private final boolean hasFlash = false;

    public IphoneCamera() {
        super(ZOOM);
    }

    public boolean isHasFlash() {
        return hasFlash;
    }

    @Override
    public String toString() {
        return "IphoneCamera{"
                + "hasFlash=" + hasFlash
                + ", zoom='" + zoom + '\''
                + '}';
    }
}
