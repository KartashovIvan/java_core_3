package org.example.homework.second.shop;

public class Runner {
    public static void main(String[] args) {
        //Создать 4 вещи: молот (1000гр), отвертка(50гр), тетрадь(30гр), ручка(10гр)
        //Создать 2 работников:
        //-Василий,30 лет, мужчина, обладатель молота и отвертки.
        //-Марьяна,25 лет, женщина, обладательница тетради и ручки.
        Item[] vasiliyItems = {
            new Item(1000, "молот"),
            new Item(50, "отвертка"),
        };
        Item[] marianaItems = {
            new Item(30, "тетрадь"),
            new Item(10, "ручка"),
        };
        Worker[] workers = {
            new Worker(vasiliyItems, "Василий", true, 30),
            new Worker(marianaItems, "Марьяна", false, 25)
        };
        Shop shop = new Shop(workers);
        shop.printWorkersInfo();
        System.out.println("___________________________________________");
        for (Worker worker : shop.workers) {
            worker.brag();
        }
    }
}
