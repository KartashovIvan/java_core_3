package org.example.homework.four.ex2;

public class Airplane implements Fly {
    private int countPassengers;

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("Ошибка: пассажиров в самолете меньше 0");
        }
        System.out.println("самолет летит");
    }
}
