package org.example.homework.four.ex1;

public class CarWash {
    public int washCar(Car car) {
        car.setClean(true);
        if (car.getLength() > 6.0 || car.getHeight() > 2.5 || car.getWidth() > 2.0) {
            return 4000;
        }
        return 2000;
    }

    public int washCar(Car... cars) {
        int price = 0;
        for (Car car : cars) {
            price += washCar(car);
        }
        return price;
    }
}
