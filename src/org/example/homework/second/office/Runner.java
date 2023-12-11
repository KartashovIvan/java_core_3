package org.example.homework.second.office;

public class Runner {
    public static void main(String[] args) {
        Boss boss = new Boss("Боря");
        Manager manager = new Manager("Аркадий");
        Security security = new Security("Петрович");
        Secretary secretary = new Secretary();
        Office office = new Office(boss, secretary, security, manager);
        office.startWorkday();
    }
}
