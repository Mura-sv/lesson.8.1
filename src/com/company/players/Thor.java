package com.company.players;

import com.company.game.RPG_Game;

public class Thor extends Hero {

    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int chance = RPG_Game.random.nextInt(5);
        if (chance == 1) {
            boss.setDamage(0);
            System.out.println("Thor bashes Boss for 1 round");
        }
    }


}
