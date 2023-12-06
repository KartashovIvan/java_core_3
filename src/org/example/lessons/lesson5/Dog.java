package org.example.lessons.lesson5;

public class Dog {
    private static int counter = 0;
    private static Dog[] dogs = new Dog[10];
    private String name;

    public Dog(String name) {
        this.name = name;
        dogs[counter] = this;
        counter++;
    }

    public static void printDogsName() {
        System.out.println("Имена собак");
        for (int i = 0; i < counter; i++) {
            System.out.println(dogs[i].name);
        }
    }

    public int getCounter() {
        return counter;
    }

}
