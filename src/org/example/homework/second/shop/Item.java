package org.example.homework.second.shop;

public class Item {
    int weight;
    String name;

    public Item(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public static String getTextItems(Item[] items) {
        String text = "";
        for (Item item : items) {
            text += String.format("имя вещи: %s, вес вещи: %s\n", item.name, item.weight);
        }
        return text;
    }
}
