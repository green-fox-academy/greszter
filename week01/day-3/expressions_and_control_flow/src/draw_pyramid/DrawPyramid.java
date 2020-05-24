package draw_pyramid;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add a number:");
        int userNumber = scanner.nextInt();
        int i;
        int j;

        for (i = 1; i <= userNumber; i++) {
            for (j = 1; j <= (userNumber - i); j++)
                System.out.print(" ");
            for (j = 1; j <= i; j++)
                System.out.print("*");
            for (j = (i - 1); j >= 1; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}


