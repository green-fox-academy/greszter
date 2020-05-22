package animals_and_legs;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of chickens:");
        int numberOfChickens = scanner.nextInt();
        System.out.println("Number of pigs:");
        int numberOfPigs = scanner.nextInt();

        System.out.println("Number of legs:");
        System.out.println((numberOfChickens * 2) + (numberOfPigs * 4));


    }
}
