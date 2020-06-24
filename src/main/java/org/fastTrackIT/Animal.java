package org.fastTrackIT;

public class Animal  {


 String name;
    String exercise;
    double availableBalance;


    double age;
    double health;
    double hunger;
    double mood;
    String food;


    int legCount;


   public Animal(String name, String exercise,
                 double availableBalance, double age, double health, double hunger,
                 double mood, String food, int legCount) {
      this.name = name;
      this.exercise = exercise;
      this.availableBalance = availableBalance;
      this.age = age;
      this.health = health;
      this.hunger = hunger;
      this.mood = mood;
      this.food = food;
      this.legCount = legCount;
   }

   public Animal() {

   }

   public static String name() {
        return null;



    }
}



