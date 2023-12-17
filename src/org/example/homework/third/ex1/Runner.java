package org.example.homework.third.ex1;

public class Runner {
    public static void main(String[] args) {
        Tree[] trees = {
            new Pine(20),
            new Fir(30),
            new Birch(50)
        };

        double sum = 0;
        for (Tree tree : trees) {
            sum += tree.getAge();
        }
        System.out.println("Средний возраст деревьев: " + (sum / trees.length));
    }
}
