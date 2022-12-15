package com.company;


public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamageOfBoss(100);
        boss.setHealthOfBoss(800);
        boss.setTypeOfProtection("Magical");
        System.out.println("Boss damage: " + boss.getDamageOfBoss() + "  Health: " + boss.getHealthOfBoss() + "  Type of protection: " + boss.getTypeOfProtection());

        Hero[] heroesList = createHeroes();
        for (Hero h : heroesList) {
            System.out.println("Hero's superpower: " + h.getSuperpowerOfHero() + "  Damage: " + h.getDamageOfHero()
                    + "  Health: " + h.getHealthOfHero());

        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(200, 40, "Kinetic");
        Hero hero2 = new Hero(300, 45);
        hero2.setSuperpowerOfHero("Physical");
        Hero hero3 = new Hero(250, 55, "Magical");
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;

    }
}
