package org.fastTrackIT;

public class Adopter {
    String exercise;
    String name;
    double availableBalance;

    public void feeding(Animal animal,AnimalFood animalFood) {
        System.out.println("Feeding animal" + name);
        System.out.println(name + " just gave some " + animalFood.name + " to " + animal.name + "!");

        System.out.println(animal.name + " hunger level is now: " + animal.mood);


    }

    public void exercie(Animal animal , RecreationActivity recreationActivity) {
        System.out.println("Exercise animal" + name);
        System.out.println(name + " just did  " + recreationActivity.name + " with " + animal.name + "!");
        System.out.println(animal.name + "s happiness level is now: " + animal.mood);




    }

}

