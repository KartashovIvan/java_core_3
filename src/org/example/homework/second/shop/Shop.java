package org.example.homework.second.shop;

public class Shop {
    Worker[] workers;
    private final ItemUtil itemUtil = new ItemUtil();

    public Shop(Worker[] workers) {
        this.workers = workers;
    }

    public void printWorkersInfo() {
        for (Worker worker : workers) {
            String sex = worker.isMale ? "мужчина" : "женщина";
            System.out.printf("%s: %s лет, %s, список вещей:\n%s",
                    worker.name, worker.age, sex, itemUtil.getTextItems(worker.items));
        }
    }
}
