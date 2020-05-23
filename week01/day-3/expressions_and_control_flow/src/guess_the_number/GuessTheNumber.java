package guess_the_number;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8

        int stored = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess number:");
        int guess = scanner.nextInt();

        while (guess != stored){
            if (guess > stored){
                System.out.println("The stored number is lower");
                System.out.println("Try again!");
                guess = scanner.nextInt();
            }else if (guess < stored){
                System.out.println("The stored number is higher");
                System.out.println("Try again!");
                guess = scanner.nextInt();
            }
        }
        if (guess == stored){
            System.out.println("You found the number: " + stored);
        }
    }
}





