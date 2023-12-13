package org.example.homework.third.ex4;

public class LotteryTicket {
    private static int counter;

    public LotteryTicket() {
        counter++;
    }

    public int checkMiracle() {
        if (counter % 100 == 0) {
            return 5_000;
        } else if (counter % 10 == 0) {
            return 100;
        }
        return 0;
    }
}
