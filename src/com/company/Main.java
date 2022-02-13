package com.company;

public class Main {

    public static void main(String[] args) {
        Boss Akuma = new Boss(1000,  100);
        Akuma.weapon.setWeapon("AvadraKedavra");
        Akuma.weapon.setWeaponType("magicalSpell");
        System.out.println(Akuma.printInfo());
        Skeleton sk1 = new Skeleton(100,20,30);

        Skeleton sk2 = new Skeleton(120,30,40);
        sk1.weapon.setWeapon("fireBow");
        sk2.weapon.setWeapon("classicBow");
        sk1.weapon.setWeaponType("magicalType");
        sk2.weapon.setWeaponType("classicType");
        System.out.println(sk1.printInfo() + "\n"+ sk2.printInfo());


    }

}
