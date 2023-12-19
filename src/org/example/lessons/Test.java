package org.example.lessons;

public class Test {

    String name;

    public Test(String name) {
        this.name = name;
    }

    public String getName() {
        return converter(name);
    }

    private static String converter(String name) {
        return name.trim().toUpperCase();
    }

}
