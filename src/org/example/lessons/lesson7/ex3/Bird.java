package org.example.lessons.lesson7.ex3;

public class Bird implements Flyable {
    public void fly() {
        System.out.println("Птица летит");
    }

    @Override
    public void fall(int fallSpeed) {
        if (fallSpeed > 500) {
            System.out.println("птица очень быстро падает");
        } else {
            System.out.println("птица падает");
        }
    }
}
