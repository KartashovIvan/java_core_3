package org.example.homework.second.shop;

public class Worker {
    Item[] items;
    String name;
    boolean isMale;
    int age;

    public Worker(Item[] items, String name, boolean isMale, int age) {
        this.items = items;
        this.name = name;
        this.isMale = isMale;
        this.age = age;
    }

    public void brag() {
        for (Item item : items) {
            System.out.printf("%s: смотрите какая у меня вещь - %s\n",
                    this.name, item.name);
        }
    }
}
