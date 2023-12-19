package org.example.homework.second.office;

public class Secretary {
    public void keepCalm(Manager manager, Boss boss, Security security) {
        System.out.printf("%s не волнуйтесь, %s все успеет. %s - подождите!\n",
                boss.name, manager.name, security.name);
    }
}
