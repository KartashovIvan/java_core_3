package org.example.homework.third.ex2.phone;

import org.example.homework.third.ex2.components.IphoneCamera;
import org.example.homework.third.ex2.components.SamsungCamera;

public class SamsungGalaxy extends Phone {
    private static final String MODEL = "Samsung galaxy";

    public SamsungGalaxy() {
        super(MODEL);
    }

    public void setCamera(SamsungCamera camera) {
        super.setCamera(camera);
    }

}
