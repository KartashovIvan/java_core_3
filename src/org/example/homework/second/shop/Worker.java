package org.example.homework.second.shop;

public class Worker {
    String name;
    int age;
    String gender;
    Item [] items;

    public Worker(String name, int age, String gender, Item[] items) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.items = items;
    }

    public void tellAboutItems (){
        for (Item item :
                items) {
            System.out.println(this.name + ": смотрите какая у меня вещь - " + item.name);
        }
    }
}
