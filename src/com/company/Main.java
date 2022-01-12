package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(99);
        boss.setDamage(19);
        boss.setDefense("Armor");
        System.out.println("Boss health - " + boss.getHealth() + ", \nDamage - " + boss.getDamage() + ", \nDefense - " + boss.getDefense());

        for(Hero i : createHeroes()){
            System.out.println(i.getHealth() + " " + i.getDamage() + " " + i.getAbility());
        }
    }

    public static Hero[] createHeroes(){
        Hero Hulk = new Hero(300, 45, "Power");
        Hero Thor = new Hero(250, 20, "Hammer");
        Hero Wasp = new Hero(100,7, "Telepathic");

        Hero heroes[] = {Hulk, Thor, Wasp};
        return heroes;
    }
}
