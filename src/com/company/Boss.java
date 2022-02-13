package com.company;

import javax.xml.transform.stream.StreamResult;

public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public Weapon getStr() {
        return weapon;
    }

    public void setStr(Weapon str) {
        this.weapon = str;
    }


    public Boss(int health, int damage) {
        super(health, damage);

    }

    public String printInfo(){
        return getHealth() + " " +getDamage() +" " + weapon.getWeaponType() +" "+ weapon.getWeapon();
    }

}
