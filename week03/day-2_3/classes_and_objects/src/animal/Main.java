package animal;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal();
        Animal dog = new Animal();
        Animal pig = new Animal();
        Animal goat = new Animal();

        Farm farm = new Farm(3);

        farm.breed(cat);
        farm.breed(dog);
        farm.breed(pig);
        farm.breed(goat);

        System.out.println("Cat hunger: " + cat.getHunger());
        System.out.println("Cat thirst: " + cat.getThirst());
        System.out.println("Dog hunger: " + dog.getHunger());
        System.out.println("Dog thirst: " + dog.getThirst());
        System.out.println("Pig hunger: " + pig.getHunger());
        System.out.println("Pig thirst: " + pig.getThirst());
        cat.play();
        cat.play();
        cat.drink();
        cat.eat();
        cat.drink();
        cat.eat();
        dog.play();
        dog.eat();
        dog.eat();
        dog.eat();
        pig.play();
        pig.play();
        pig.play();
        pig.play();
        pig.play();
        pig.play();
        pig.play();
        pig.play();
        pig.play();
        pig.play();
        System.out.println("Cat hunger: " + cat.getHunger());
        System.out.println("Cat thirst: " + cat.getThirst());
        System.out.println("Dog hunger: " + dog.getHunger());
        System.out.println("Dog thirst: " + dog.getThirst());
        System.out.println("Pig hunger: " + pig.getHunger());
        System.out.println("Pig thirst: " + pig.getThirst());

        System.out.println("Number of animals: " + farm.numberOfAnimals());

        farm.slaughter();

        System.out.println("Number of animals: " + farm.numberOfAnimals());
    }
}
