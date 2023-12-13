package org.example.homework.third.ex2;

public class Factory {
    public void createTelephone (Samsung samsung,OperationSystem operationSystem,Motherboard motherboard, Camera camera) {
        samsung.setOperationSystem(operationSystem);
        samsung.setMotherboard(motherboard);
        samsung.setCamera(camera);
        System.out.println(samsung);
    }

    public void createTelephone (Iphone iphone,OperationSystem operationSystem,Motherboard motherboard, Camera camera){
        iphone.setOperationSystem(operationSystem);
        iphone.setMotherboard(motherboard);
        iphone.setCamera(camera);
        System.out.println(iphone);
    }
}
