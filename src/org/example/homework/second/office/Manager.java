package org.example.homework.second.office;

public class Manager {
    //Менеджер обладает именем. Умеет кричать - "я ничего не успеваю, помогите!".
    String name;

    public Manager(String name) {
        this.name = name;
    }

    public void shout (){
        System.out.println("я ничего не успеваю, помогите!");
    }
}
