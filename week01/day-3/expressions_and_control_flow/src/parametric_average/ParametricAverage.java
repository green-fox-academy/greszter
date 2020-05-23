package parametric_average;

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add a number:");
        int userNumber = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < userNumber; i++){
            System.out.println("Add and integer:");
            int userInteger = scanner.nextInt();
            sum = sum + userInteger;
        }

        System.out.println("Sum: " + sum + ", Average: " + (sum / (double) userNumber));


    }
}
