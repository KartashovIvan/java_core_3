package org.example.homework.third.ex2;

public class Camera {
    private final String name;
    private final int zoom;
    private final boolean flash;

    public Camera(String name, int zoom, boolean flash) {
        this.name = name;
        this.zoom = zoom;
        this.flash = flash;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "name='" + name + '\'' +
                ", zoom=" + zoom +
                ", flash=" + flash +
                '}';
    }
}
