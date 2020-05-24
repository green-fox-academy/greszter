package draw_diamond;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add a number:");
        int userNumber = scanner.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            for (int j = 1; j <= (userNumber - i); j++)
                System.out.print(" ");
            for (int k = 1; k <= (i); k++)
                System.out.print("*");
            for (int l = (i - 1); l >= 1; l--)
                System.out.print("*");
            System.out.println();
        }

        for (int m = 1; m <= (userNumber - 1); m++){
            for (int n = 1; n <= m; n++)
                System.out.print(" ");
            for (int p = (userNumber - m - 1); p >= 1; p--)
                System.out.print("*");
            for (int o = (userNumber - m); o >= 1; o--)
                System.out.print("*");
            System.out.println();
        }
    }
}

