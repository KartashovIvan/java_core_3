package org.example.homework.four.ex2;

public class Duck implements Fly {
    private boolean isInjured;

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("Ошибка: утка ранена");
        }
        System.out.println("утка летит");
    }
}
