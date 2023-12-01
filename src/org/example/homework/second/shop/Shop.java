package org.example.homework.second.shop;

public class Shop {
    Worker[] workers;

    public Shop(Worker[] workers) {
        this.workers = workers;
    }

    public void printWorkers() {
        for (Worker worker : workers) {
            System.out.println(worker.name + ": "
                    + worker.age + " лет, "
                    + worker.gender + ", список вещей: "
                    + worker.items[0].name
                    + ", "
                    + worker.items[1].name);
        }
    }
}
