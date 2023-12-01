package org.example.homework.second.office;

public class Boss {
    String name;

    public Boss(String name) {
        this.name = name;
    }

    public void hurryUpManager (Manager manager) {
        System.out.println(manager.name + " быстрее!");
    }
}
