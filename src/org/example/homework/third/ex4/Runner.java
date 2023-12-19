package org.example.homework.third.ex4;

public class Runner {
    public static void main(String[] args) {
        int countTickets = 110;
        LotteryTicket[] lotteryTickets = new LotteryTicket[countTickets];
        for (int i = 0; i < countTickets; i++) {
            lotteryTickets[i] = new LotteryTicket();
        }

        int sum = 0;
        for (int i = 0; i < lotteryTickets.length; i++) {
            sum += lotteryTickets[i].checkLuck();
        }
        System.out.println("Выигрыш составил: " + sum);
    }
}
