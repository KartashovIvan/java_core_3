package org.example.lessons.example;

import org.example.lessons.lesson5.Cat;

public class Human {
    public static final String APPEAL_TO_HUMAN = "mr.";
    private static final String name2;
    private String name;
    private String appeal;
    private final int yearOfBirth;
    private final Cat cat;

    static {
        System.out.println("Привет мир!");
        name2 = "hello";
    }

    public Human(int yearOfBirth, Cat cat) {
        this.yearOfBirth = yearOfBirth;
        this.cat = cat;
        this.appeal = APPEAL_TO_HUMAN;
    }



    public String getName() {
        return APPEAL_TO_HUMAN + name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public Cat getCat() {
        return cat;
    }
}
