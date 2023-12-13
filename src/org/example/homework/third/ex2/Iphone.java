package org.example.homework.third.ex2;

public class Iphone extends Telephone{
    private OperationSystem operationSystem;
    private Motherboard motherboard;
    private Camera camera;

    public Iphone(String name) {
        super(name);
    }

    public void setOperationSystem(OperationSystem operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "operationSystem=" + operationSystem +
                ", motherboard=" + motherboard +
                ", camera=" + camera +
                '}';
    }
}
