package org.example.homework.second.shop;

public class Runner {
    public static void main(String[] args) {
        Item hammer = new Item(1000, "молот");
        Item screwdriver = new Item(50, "отвертка");
        Item notebook = new Item(30, "тетрадь");
        Item pen = new Item(10, "ручка");

        Worker vasia = new Worker("Василий", 30, "мужчина", new Item[]{hammer, screwdriver});
        Worker mariana = new Worker("Марьяна", 25, "женщина", new Item[]{notebook, pen});
        Worker[] workers = {vasia, mariana};

        Shop shop = new Shop(workers);
        shop.printWorkers();

        for (Worker worker : workers) {
            worker.tellAboutItems();
        }
    }
}
