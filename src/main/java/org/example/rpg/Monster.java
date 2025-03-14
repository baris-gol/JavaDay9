package org.example.rpg;

public abstract class Monster implements Bleedable, Poisonable {
    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, int hitPoint, double damage){
        this.name = name;
        this.hitPoints = hitPoint;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    public double attack(){
        return getDamage() + bleed() + poison();
    }


    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

    @Override
    public double poison() {
        return getDamage()*0.3;
    }
}