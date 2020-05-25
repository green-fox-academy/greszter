package summing;

import java.util.Scanner;

public class Summing {
    public static void main(String[] args) {
        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter

        System.out.println("Add a number:");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.println(sum(number));

    }

    public static int sum(int input) {
        int all = 0;
        for (int i = 0; i <= input; i++) {
            all = all + i;
        }
        return all;
    }
}