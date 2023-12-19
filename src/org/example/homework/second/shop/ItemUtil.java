package org.example.homework.second.shop;

public class ItemUtil {
    public String getTextItems(Item[] items) {
        String text = "";
        for (Item item : items) {
            text += String.format("имя вещи: %s, вес вещи: %s\n", item.name, item.weight);
        }
        return text;
    }
}
