package count_from_to;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Give another number:");
        int secondNumber = scanner.nextInt();

        while (firstNumber > secondNumber) {
            System.out.println("The second number should be bigger");
            secondNumber = scanner.nextInt();
        }

        if (firstNumber < secondNumber){
            for (int i = firstNumber; i <= secondNumber; i++)
            System.out.println(i);
        }


    }
}
