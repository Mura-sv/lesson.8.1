package com.company.players;

import com.company.game.RPG_Game;

public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        this.setDamage(getDamage() + RPG_Game.random.nextInt(3) + 2);
    }


}
