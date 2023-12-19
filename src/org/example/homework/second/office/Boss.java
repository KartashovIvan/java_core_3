package org.example.homework.second.office;

public class Boss {
    public String name;

    public Boss(String name) {
        this.name = name;
    }

    public void hurryManager(Manager manager) {
        System.out.printf("%s быстрее!\n", manager.name);
    }
}
