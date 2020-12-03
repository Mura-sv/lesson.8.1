package com.company.players;

import com.company.game.RPG_Game;

public class Tank extends Hero {

    public Tank(int health, int damage) {
        super(health, damage, SuperAbility.TANK);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

            boss.setDamage(boss.getDamage()-(boss.getDamage()/5));
            this.setHealth(this.getHealth()-boss.getDamage());;

    }


}
