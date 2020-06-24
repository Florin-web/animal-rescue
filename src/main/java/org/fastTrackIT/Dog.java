package org.fastTrackIT;

public class Dog extends Animal{

    public Dog(String name, String exercise, double availableBalance, double age,
               double health, double hunger, double mood, String food, int legCount, String exercise1,
               boolean dead) {
        super(name, exercise, availableBalance, age, health, hunger, mood, food, legCount);
        this.exercise = exercise1;
        this.dead = dead;
    }

    String exercise;
    boolean dead;
}
