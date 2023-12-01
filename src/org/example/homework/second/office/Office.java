package org.example.homework.second.office;

public class Office {
    Boss boss;
    Manager manager;
    Secretary secretary;
    Security security;

    public Office(Boss boss, Manager manager, Secretary secretary, Security security) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.security = security;
    }

    public void workingDay() {
        boss.hurryUpManager(manager);
        manager.shout();
        security.giveMeMoney();
        secretary.keepCalmAndWait(boss, manager, security);
    }
}
