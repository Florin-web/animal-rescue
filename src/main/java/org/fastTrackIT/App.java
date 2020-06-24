package org.fastTrackIT;

/**
 * Hello world!
 *
 */
public class App {




    public static void main(String[] args )
    {
        Animal animal = new Animal();
        animal.name= "dog";
        animal.age= 3;
        animal.health=2.5;
        animal.hunger=1;
        animal.mood=3.5;
        animal.food="royalCannin";
        animal.exercise="running";

//         System.out.println(animal.name);
//         System.out.println(animal.age);
//         System.out.println(animal.health);
//         System.out.println(animal.mood);
//         System.out.println(animal.food);
//         System.out.println(animal.exercise);


        Adopter adopter = new Adopter();
        System.out.println( "Welcome to Animal Rescure!" );




    }


}



