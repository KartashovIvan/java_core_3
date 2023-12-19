package org.example.homework.third.ex4;

public class LotteryTicket {
    private static int countTickets = 0;


    public int checkLuck() {
        countTickets++;
        if (countTickets % 100 == 0) {
            return 5_000;
        } else if (countTickets % 10 == 0) {
            return 100;
        }
        return 0;
    }
}
