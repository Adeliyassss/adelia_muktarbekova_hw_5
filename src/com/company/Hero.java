package com.company;

public class Hero {
    private int healthOfHero;
    private int damageOfHero;
    private String superpowerOfHero;

    public Hero(int healthOfHero, int damageOfHero, String superpowerOfHero) {
        this.healthOfHero = healthOfHero;
        this.damageOfHero = damageOfHero;
        this.superpowerOfHero = superpowerOfHero;
    }

    public Hero(int healthOfHero, int damageOfHero) {
        this.healthOfHero = healthOfHero;
        this.damageOfHero = damageOfHero;
    }

    public int getHealthOfHero() {
        return healthOfHero;
    }

    public String getSuperpowerOfHero() {
        return superpowerOfHero;
    }

    public int getDamageOfHero() {
        return damageOfHero;
    }

    public void setSuperpowerOfHero(String superpowerOfHero) {
        this.superpowerOfHero = superpowerOfHero;
    }
}
