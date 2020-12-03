package com.company.players;

public class Witch extends Hero {

    public Witch(int health, int damage) {
        super(health, damage, SuperAbility.REVIVAL);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() == 0) {
                heroes[i].setHealth(this.getHealth());
                this.setHealth(0);
                System.out.println("Witch revived " + heroes[i].getClass().getSimpleName());
                break;
            }
        }
    }
}
