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
        int userInput1 = scanner.nextInt();
        System.out.println("Number of pigs:");
        int userInput2 = scanner.nextInt();

        System.out.println("Number of legs:");
        System.out.println((userInput1 * 2) + (userInput2 * 4));


    }
}
