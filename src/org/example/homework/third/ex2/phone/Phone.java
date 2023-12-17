package org.example.homework.third.ex2.phone;

import org.example.homework.third.ex2.components.Camera;
import org.example.homework.third.ex2.components.MotherBoard;
import org.example.homework.third.ex2.components.OperationalSystem;

public abstract class Phone {
    private final String model;
    private Camera camera;
    private MotherBoard motherBoard;
    private OperationalSystem operationalSystem;

    public Phone(String model) {
        this.model = model;
    }

    protected void setCamera(Camera camera) {
        this.camera = camera;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void setOperationalSystem(OperationalSystem operationalSystem) {
        this.operationalSystem = operationalSystem;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", camera=" + camera +
                ", motherBoard=" + motherBoard +
                ", operationalSystem=" + operationalSystem +
                '}';
    }
}
