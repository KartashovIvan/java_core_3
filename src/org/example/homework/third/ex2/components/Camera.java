package org.example.homework.third.ex2.components;

public abstract class Camera {
    protected final String zoom;

    public Camera(String zoom) {
        this.zoom = zoom;
    }

    public String getZoom() {
        return zoom;
    }

    @Override
    public String toString() {
        return "Camera{"
                + "zoom='"
                + zoom + '\''
                + '}';
    }
}
