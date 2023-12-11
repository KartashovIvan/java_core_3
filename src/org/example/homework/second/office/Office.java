package org.example.homework.second.office;


public class Office {
    Boss boss;
    Secretary secretary;
    Security security;
    Manager manager;

    public Office(Boss boss, Secretary secretary, Security security, Manager manager) {
        this.boss = boss;
        this.secretary = secretary;
        this.security = security;
        this.manager = manager;
    }

    public void startWorkday() {
        //--Босс начинает подгонять менеджера
        //--Менеджер кричит
        //--Охранник просит аванс
        //--Секретарша всех успокаивает, и просит подождать
        boss.hurryManager(manager);
        manager.screw();
        security.askSalary();
        secretary.keepCalm(manager, boss, security);
    }
}
