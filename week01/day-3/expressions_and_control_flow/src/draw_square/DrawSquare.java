package draw_square;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int userNumber = scanner.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            System.out.print("%");
        }
        System.out.println();

        for (int i = 1; i <= (userNumber - 2); i++){
            System.out.print("%");
            for (int j = 1; j <= (userNumber - 2); j++)
                System.out.print(" ");
            System.out.print("%");
            System.out.println();
        }

        for (int i = 1; i <= userNumber; i++) {
            System.out.print("%");
        }
    }
}
