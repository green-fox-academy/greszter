package factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // - Create a function called `factorio`
        //   that returns it's input's factorial

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a number");
        int number = scanner.nextInt();

        System.out.println(factorio(number));

    }

    public static long factorio(int input) {
        long fact = 1;
        for (int i = 1; i <= input; i++){
            fact = fact * i;
        }
        return fact;
    }
}

